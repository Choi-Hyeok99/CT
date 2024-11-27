package Baekjoon.sparta.week1.S;

import java.io.*;
import java.util.*;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 : 첫째 줄에 버튼을 누른 횟수 N이 주어진다
 * * 2. 조건 :
 *      - 1 c는 뒤에, 2 c는 앞에 블록을 추가.
 *      - 3은 가장 최근에 추가된 블록을 제거.
 * * 3. 전략 :
 *      - Deque : 양쪽 끝에서 효율적으로 삽입/삭제
 *      - Stack: 추가된 방향 기록, 뒤에서 제거할지 앞에서 제거할지 결정
 * * --------------------------------------------------------------------------------
 */

public class p27497_S2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 많이 안써본 Bw -> 출력 성능 향상
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 버튼 횟수

        Deque<Character> deque = new LinkedList<>();
        Stack<Boolean> history = new Stack<>(); // true: addLast, false: addFirst

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            char op = input.charAt(0);

            if (op == '1') { // 문자열 맨 뒤 추가
                deque.addLast(input.charAt(2)); // 블록 추가
                history.push(true); // 뒤 추가됨

            } else if (op == '2') { // 문자열 맨 앞에 추가
                deque.addFirst(input.charAt(2)); // 블록 추가
                history.push(false); // 앞에 추가

            } else if (op == '3' && !deque.isEmpty()) { // 가장 나중에 추가된 블록 제거
                if (history.pop()) {
                    deque.pollLast(); // 뒤에서 제거
                } else {
                    deque.pollFirst(); // 앞에서 제거
                }
            }
        }

        // 결과 출력 (deque가 비어있으면 0 출력)
        // "0" 출력하는걸 까먹어서 백준에서 5번 이상 틀렸네요
        if (deque.isEmpty()) {
            bw.write("0");
        } else {
            for (char c : deque) {
                bw.write(c); // 하나씩 출력
            }
        }

        bw.flush();
        bw.close();
    }
}
