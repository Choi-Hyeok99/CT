package Baekjoon.sparta.week1.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 * * 2. 조건 :
 * * 3. 전략 :
 * * --------------------------------------------------------------------------------
 */
public class p2908 {
    public static void main(String[] args) throws IOException {

        // 입력받은 2개의 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String A = new StringBuilder(st.nextToken()).reverse().toString();
        String B = new StringBuilder(st.nextToken()).reverse().toString();

        int reverseA = Integer.parseInt(A);
        int reverseB = Integer.parseInt(B);

        int result = Math.max(reverseA,reverseB);
        System.out.println(result);
    }
}
