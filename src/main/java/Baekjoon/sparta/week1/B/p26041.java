package Baekjoon.sparta.week1.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 첫 번째 줄 문자열 A 입력 받는다.
 *      - 두 번쨰 줄 문자열 B 입력 받는다.
 * * 2. 조건 :
 *      - 전화번호 목록 A에서 전화번호 B와 다르며 B를 접두사로 갖는 전화번호 개수 구하기
 * * 3. 전략 :
 *      - A는 공백으로 구분 split()를 사용해 배열로 처리
 *  *   - B는 문자열로 입력받고 , 각 A가 B로 시작하는지 확인
 *  *   - B와 아예 동일한 번호는 제외하고, 접두사로 시작하는 전화번호가 몇개인지 count
 * * --------------------------------------------------------------------------------
 */
public class p26041 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] A = br.readLine().split(" ");

        String B = br.readLine();

        int count = 0;

        for (String Num : A){
            if (Num.equals(B)){
                continue;
            } else {
                if (Num.startsWith(B)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
