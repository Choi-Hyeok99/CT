package CT2401.Baekjoon.January;

/*
문제
두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

출력
첫째 줄에 다음 세 가지 중 하나를 출력한다.

A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
제한
-10,000 ≤ A, B ≤ 10,000
 */


import java.util.Scanner;

//public class p1330 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//
//        if ( A > B ){
//            System.out.println(">");
//        } else if (A < B){
//            System.out.println("<");
//        } else if ( A == B){
//            System.out.println("==");
//
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1330 {
    public static void main(String[] args) throws IOException {

        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

        String[] str = s.readLine().split(" ");

        int A = Integer.parseInt(str[0]); // 첫 번째 정수로 초기화
        int B = Integer.parseInt(str[1]); // 두 번째 정수로 초기화



        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }
    }
}
