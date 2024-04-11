package CT.Baekjoon.deepen;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1.문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

2.입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

3.출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

 */
public class p2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}