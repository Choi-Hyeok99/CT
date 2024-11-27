package Baekjoon.sparta.week1.S;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 첫 줄 명령어의 개수 N ( 1<= N <= 10,000 )
 *      - 이후 N개의 명령어가 주어짐 ( push , pop, size, empty, front, back )
 * * 2. 조건 :
 *      - 큐의 동작을 구현
 *      - 큐 연산
 * * 3. 전략 :
 *      - Queue를 사용하여 동작 처리
 *      - last를 통해 마지막 값
 * * --------------------------------------------------------------------------------
 */
public class p10845_S4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>(); // FIFO 구조
        StringBuilder sb = new StringBuilder();
        int last = 0; // back의 명령 마지막 값 Last 추적

        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // 명령어 읽기
            String S = st.nextToken(); // 명령어 추출

            switch (S){
                case "push" :
                    last = Integer.parseInt(st.nextToken());
                    queue.offer(last);
                    break;
                case "pop" :
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if (queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back" :
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
