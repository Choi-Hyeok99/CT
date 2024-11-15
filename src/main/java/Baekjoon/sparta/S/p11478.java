package Baekjoon.sparta.S;


import java.io.*;
import java.util.*;


/**
 *
 * 문제 분석
 * --------------------------------------------------------------------------------
 * 1. 입력 :
 *    - 문자열 S가 주어진다 (소문자로만 구성)
 *
 * 2. 조건 :
 *    - S의 서로 다른 부분 문자열의 개수를 구해야 한다
 *    - 부분 문자열은 연속된 부분에서 일부를 잘라낸 문자열
 *    - 예를 들어 S가 "ababc"라면, a, b, ab, ba, abc 등 여러 부분 문자열이 가능하고, 중복되는 부분 문자열은 하나로 취급한다
 *
 * 3. 전략 :
 *    - 문자열 S의 모든 가능한 부분 문자열을 만들어서 Set에 저장
 *    - Set은 중복을 허용하지 않으므로, 서로 다른 부분 문자열만 남는다
 *    - 최종적으로 Set의 크기가 서로 다른 부분 문자열의 개수
 * --------------------------------------------------------------------------------
 */
public class p11478 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        // 중복되지 않는 서로 다른 부분 문자열을 저장하기 위해 Set 사용
        // HashSet은 순서 X , 중복허용하지 않는다 ( 중복된 부분 문자열은 자동으로 제거 )
        Set<String> set = new HashSet<>();

        // 이중 반복문
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length()+1; j++){
                set.add(s.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}
