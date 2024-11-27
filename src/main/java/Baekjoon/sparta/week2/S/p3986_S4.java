package Baekjoon.sparta.week2.S;


import java.io.*;
import java.util.*;
/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 단어의 수 N
 * * 2. 조건 :
 *      - 좋은 단어: 모든 문자를 쌍으로 제거 가능
 *      - 연속된 두 문자가 같으면 제거
 *      - 모든 문자가 제거되면 좋은 단어
 * * 3. 전략 :
 *      - 스택을 사용하여 문자 쌍을 제거
 *      - 현재 문자와 스택의 최상단 문자(최근 문자)를 비교
 *          - 같으면 스택에서 제거 ( pop )
 *          - 다르면 스택에서 추가 ( push )
 *      - 단어 순회 후 스택이 비어 있으면 좋은 단어
 * * --------------------------------------------------------------------------------
 */
public class p3986_S4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어 수

        int count = 0; // 좋은 단어의 개수

        for (int i=0; i<N; i++){ // 각 단어 처리
            Stack<Character> st = new Stack<>();
            String s = br.readLine(); // 단어 입력

            for(int j =0; j<s.length(); j++){
                char val = s.charAt(j); // 현재 문자

                if (st.isEmpty()){ // 스택이 비어있는 경우
                    st.push(val); // 문자를 스택에 추가
                } else {
                    // 스택의 최상단 문자와 현재 문자가 같으면
                    if(st.peek() == val) {
                        st.pop(); // 문자 쌍 제거
                    } else {
                        st.push(val); // 같지 않으면 현재 문자를 스택에 추가
                    }
                }
            }
            if (st.empty()){
                // 단어 순회 후 스택이 비어 있으면 좋은 단어
                count++;
            }
        }
        System.out.println(count);
    }
}
