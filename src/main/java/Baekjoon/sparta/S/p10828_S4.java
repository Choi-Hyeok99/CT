package Baekjoon.sparta.S;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 * 명령의 개수 N이 주어짐.
 * 이후 N개의 명령어가 한 줄에 하나씩 주어짐. 명령어는 다음 중 하나:
 * push X : X를 스택에 추가.
 * pop : 스택의 최상단 값을 제거하고 출력. 비어있으면 -1 출력.
 * size : 스택에 있는 값의 개수 출력.
 * empty : 스택이 비어있으면 1, 아니면 0 출력.
 * top : 스택의 최상단 값 출력. 비어있으면 -1 출력.
 *
 * * 2. 조건 :
 * 스택의 최대 크기는 10,000 이하.
 *
 * * 3. 전략 :
 * 스택을 배열로 구현하여 크기를 직접 관리.
 *
 * 명령어에 따라 적절한 메서드를 호출.
 *
 * 출력이 필요한 명령어는 StringBuilder를 사용해 모아서 한 번에 출력.
 * 	18992Kb	156ms
 *
 * Stack을 쓰면 속도는 똑같으나 Vecot기반이기 떄문에 메모리를 더 쓴다.
 *  19992Kb 156ms
 * * --------------------------------------------------------------------------------
 */
public class p10828_S4 {
    static int[] stack = new int[10001]; // 최대 수
    static int size; // 현재 스택에 저장된 원소 개수
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); // 출력 최적화

        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken(); // 명령어 추출

            switch (s){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    static void push(int num){
        stack[size] = num;
        size++;
    }
    static int pop(){
        if(size == 0) return -1;
        else {
            int P = stack[size-1];
            size--;
            return P;
        }
    }
    static int size(){
        return size;
    }
    static int empty(){
        if (size == 0 ) return  1;
        else return 0;
    }
    static int top(){
        if (size == 0) return  -1;
        else {
            int T = stack[size-1];
            return T;
        }
    }

}
