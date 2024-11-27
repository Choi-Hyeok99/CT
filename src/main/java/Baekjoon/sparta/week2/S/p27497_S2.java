package Baekjoon.sparta.week2.S;



import java.io.*;
import java.util.*;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 버튼 누른 횟수 N (1 <= N <= 100,000)
 *      - "1 X": X(문자)를 문자열 맨 뒤에 추가
 *      - "2 X": X(문자)를 문자열 맨 앞에 추가
 *      - "3": 가장 나중에 추가된 블록 제거
 *
 * * 2. 조건 :
 *      - Deque를 사용하여 문자열을 구성
 *      - Stack을 사용하여 추가된 위치(앞인지 뒤인지) 추적
 *      - 3번 명령(제거)은 Stack에서 가장 최근 기록을 `pop()`하여 Deque에서 제거 위치 결정
 *      - Deque가 비어 있으면 결과는 "0"
 * * 3. 전략 :
 *      - 1. 명령 1: `addLast(X)`와 `history.push(true)`
 *      - 2. 명령 2: `addFirst(X)`와 `history.push(false)`
 *      - 3. 명령 3: `pop()`으로 기록된 추가 위치 확인 후, Deque에서 제거
 * * --------------------------------------------------------------------------------
 */
public class p27497_S2 {
    public static void main(String[] args) throws IOException{

        // 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        // N 설정
        int N = Integer.parseInt(br.readLine());

        // 양방향 큐, 삽입/삭제 용이
        Deque<Character> deque = new LinkedList<>();
        // 앞인지 뒤인지 기억하여 이후 마지막에 들어간걸 제거
        Stack<Boolean> history = new Stack<>(); // true : addLast , false : addFirs


        // N번의 명령을 처리
        for(int i=0; i<N; i++){
            String input = br.readLine(); // 명령 입력
            char option = input.charAt(0); // 명령 유형 {1, 2, 3}

            if(option == '1'){
                deque.addLast(input.charAt(2)); // 명령의 세 번째 문자가 블록
                history.push(true); // 뒤에 추가되었음을 기록 ( True )
            } else if (option == '2'){
                deque.addFirst(input.charAt(2));
                history.push(false);
            } else if (option == '3' && !deque.isEmpty()){
                // 명령 3:  가장 나중에 추가된 블록 제거
                // pop에서 꺼낸 것이 true이면 if조건문 안에 코드 실행
                // false이면 if조건 외 Else에서 조건 실행
                if(history.pop()){
                    deque.pollLast();
                } else {
                    deque.pollFirst();
                }
            }
        }

        // 결과 출력
        if(deque.isEmpty()){
            bw.write("0");
        } else {
            for (char c : deque){
                bw.write(c);
            }
        }

        // 출력 스트림 닫기
        bw.flush();
        br.close();
        bw.close();
    }
}




