package Baekjoon.sparta.week2.S;

import java.io.*;
import java.util.*;
/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 문자열 여러 줄 입력
 *      - 문자열 소괄호 () , 대괄호 [] 포함
 *      - 종료 조건 .
 * * 2. 조건 :
 *      - 모든 여는 괄호는 닫는 괄호와 짝을 이루어야함
 *      - 닫는 괄호가 여는 괄호보다 먼저 나오면 안됨
 *      - 괄호 열고 닫히는 순서가 있다.
 *      - Ex) ([]) 가능 ([)] 불가능
 *      - 균형이 맞으면 "yes", 맞지 않으면 "no" 출력.
 * * 3. 전략 :
 *      - 괄호의 조건 중 후입선출(LIFO) 구조를 사용하는 스택이 적합
 *      - 여는 괄호는 스택에 추가
 *      - 닫는 괄호는 스택에서 꺼내어 짝을 비교
 *      - 스택을 통해 여는 괄호의 순서를 기록, 닫는 괄호를 만나면 스택에서 제거
 *      - 모든 문자 확인 후 스택이 비어있으면 균형 , 아니면 불균형
 * * --------------------------------------------------------------------------------
 */
public class p4949_S4 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input; // 입력 받을 문자열 변수

        // 입력 반복 ( 종료 조건 : "." )
        while(!(input = br.readLine()).equals(".")){ // 입력 문자열이 "."이면 반복 종료
            Stack<Character> stack = new Stack<>(); // 여는 괄호 저장할 스택
            boolean check = true; // 초기 상태를 균형 상태로 설정

            // 문자열 각 순회
            for(int i=0; i<input.length(); i++){
                char ch = input.charAt(i); // 현재 문자

                if ( ch == '(' || ch == '['){ // 여는 괄호
                    stack.push(ch); // 스택에 추가
                } else if (ch == ')') { // 닫는 소괄호
                    if(stack.isEmpty() || stack.pop() != '(' ){ // 스택이 비었거나 짝이 맞지 않으면
                        check = false; // 균형 X
                        break;
                    }
                } else if ( ch == ']') { // 닫는 대괄호면
                    if(stack.isEmpty() || stack.pop() != '['){ // 스택이 비었거나 짝이 맞지 않으면
                        check = false;
                        break;
                    }
                }
            }
            // 문자열 순회 후 스택이 비어있지 않으면 균형 X
            if(!stack.isEmpty()){
                check = false;
            }
            // 출력
            System.out.println(check ? "yes" : "no");
        }
    }
}
