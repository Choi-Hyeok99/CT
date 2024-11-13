package Baekjoon.B;

import java.util.Scanner;

/**
 * 1.문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *
 * 2.입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 3.출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
public class p2439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=N; i++){
            //  공백 출력
            for (int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            // 별 출력
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
