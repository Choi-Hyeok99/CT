package Baekjoon.sparta.week1.B;


import java.util.Scanner;

/**
 * 1. 문제
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 *
 * 2.입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 3.출력
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 *
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 : 첫째 줄에 정수 N(1 ≤ N ≤ 100)이 주어진다.
 * * 2. 조건 : 첫째 줄부터 2×N-1번째 줄까지 별을 출력한다.
 * * 3. 전략 :
 *      - 첫 번째 부분은 i를 1부터 N까지 증가시키며 별을 출력하고, 공백을 출력한 후 별을 출력한다.
 *      - 두 번째 부분은 i를 N-1부터 1까지 감소시키며 별을 출력하고, 공백을 출력한 후 별을 출력한다.
 * * --------------------------------------------------------------------------------
 */
import java.util.Scanner;

public class p2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 첫 번째 부분 (별이 증가하는 부분)
        for (int i = 1; i <= N; i++) {
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 공백 출력
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 두 번째 부분 (별이 감소하는 부분)
        for (int i = N - 1; i >= 1; i--) {
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 공백 출력
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
