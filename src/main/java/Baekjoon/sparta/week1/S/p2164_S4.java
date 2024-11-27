package Baekjoon.sparta.week1.S;

import java.io.*;
import java.util.*;

/**
 ** 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 입력 : N ( 1 <= N <= 500,000 )
 * * 2. 조건 :
 *      - 카드는 1번부터 N번까지
 *      - 첫 카드 제거
 *      - 두 번쨰 카드 맨 뒤로 이동
 *      - 카드 하나 남을 떄 까지 반복
 * * 3. 전략 :
 *      - Queue(큐) 사용
 *          - FIFO 방식
 *      - 시간 복잡도 최적화
 *          - 큐의 삽입/삭제 연산은 O(1)
 *          - List는 메모리를 많이 먹는다.
 * * --------------------------------------------------------------------------------
 */
public class p2164_S4 {
    public static void main(String[] args) throws IOException{
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 카드 개수
        int N = Integer.parseInt(br.readLine());

        // 큐 생성 ( ArrayDeque )
        Queue<Integer> queue = new ArrayDeque<>();

        // 1부터 N까지 배치
        for (int i=1; i<=N; i++){
            queue.add(i);
        }

        while (queue.size()>1){
            queue.poll(); // 맨 앞 카드 버림
            queue.add(queue.poll()); // 두 번째 카드 뒤로 이동 ( 맨 뒤 )
        }
        System.out.println(queue.peek()); // 카드 출력
    }
}
