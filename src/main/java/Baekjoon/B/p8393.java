package Baekjoon.B;

import java.util.Scanner;

/**
 * N까지 이기때문에 범위를 <= n 을 하는게 좋다.
 */
public class p8393 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i=0; i<=n; i++){
            result+=i;
        }
        System.out.println(result);
    }
}
