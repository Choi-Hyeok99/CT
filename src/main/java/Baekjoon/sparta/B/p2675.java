package Baekjoon.sparta.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 * * 2. 조건 :
 * * 3. 전략 :
 * * --------------------------------------------------------------------------------
 */
public class p2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 각 문자를

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++){
            String[] st = br.readLine().split(" ");

            int count = Integer.parseInt(st[0]);
            String w = st[1];

            for (int j=0; j<w.length(); j++){
                for (int k=0; k<count; k++){
                    System.out.print(w.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
