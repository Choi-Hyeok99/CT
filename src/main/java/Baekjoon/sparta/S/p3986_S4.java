package Baekjoon.sparta.S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
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

                if (stack.isEmpty() || stack.peek() != currentChar) {
                    stack.push(currentChar);
                } else stack.pop();
            }

            if (stack.empty()) {
                goodWordCount++;
            }
        }
        System.out.println(goodWordCount);
    }
}