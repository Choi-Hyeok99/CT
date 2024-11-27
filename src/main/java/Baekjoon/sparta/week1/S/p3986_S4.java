package Baekjoon.sparta.week1.S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 ** 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 첫 번째 줄에 단어의 개수 N
 *      - 이후 N개의 줄에 각각 단어
 * * 2. 조건 :
 *      - "좋은 단어"의 조건
 *      1) 단어의 문자를 왼쪽부터 순서대로 처리했을 때, 동일한 문자가 짝을 이루어 제거될 수 있어야 한다.
 *      2) 모든 문자를 처리한 후 스택이 비어 있으면 "좋은 단어"이다.
 * * 3. 전략 :
 *      - 문자를 스택에 삽입
 *      - 삽입 문자와 최상단 문자가 같으면 제거
 *      - 문자를 모두 처리 후 스택이 비어 있으면 "좋은 단어"
 *      - 단어_ㅣ 개수를 카운트 후 출력
 *
 * * --------------------------------------------------------------------------------
 */
public class p3986_S4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받을 단어의 개수
        int wordCount = Integer.parseInt(br.readLine());

        int goodWordCount = 0;

        for (int i = 0; i < wordCount; i++) {
            Stack<Character> stack = new Stack<>();
            String word = br.readLine();

            for (int j = 0; j < word.length(); j++) {

                char currentChar = word.charAt(j);

                // 스택이 비어 있으면 추가 || 최상단 문자와 현재 문자가 다르면 현재 문자 추가  만약 같으면 최상단 문자 제거 (pop)
                if (stack.isEmpty() || stack.peek() != currentChar) {
                    stack.push(currentChar);
                } else stack.pop();
            }

            // 모든 문자를 처리한 후 스택이 비어 있으면 "좋은 단어"
            if (stack.empty()) {
                goodWordCount++;
            }
        }
        System.out.println(goodWordCount);
    }
}