package Baekjoon.sparta.B;

import java.util.Scanner;

/**
 * 1.문제
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 *
 * 2.입력
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 *
 * 3.출력
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 *
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 *
 * 문제 분석
 * --------------------------------------------------------------------------------
 * 1. 입력 : 두 개의 정수 A와 B를 입력
 * 2. 조건 : A와 B를 비교하여 >,<,== 을 출력합니다 ( 비교 연산결과에 따라 조건문 작성 )
 * 3. 전략 : 간단한 조건문을 사용하여 A와 B를 비교
 * --------------------------------------------------------------------------------
 */
public class p1330 {
    public static void main(String[] args) {

        /**
         * 1번 풀이
         */

        // 입력
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // 조건( 전략 )
        if( A > B ){
            System.out.println(">");
        } else if ( A < B ){
            System.out.println("<");
            } else if ( A == B ){
            System.out.println("==");
        }
    }
}
