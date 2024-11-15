package Baekjoon.sparta.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 첫 번쨰 줄 테스트 케이스 갯수 n이 주어진다. ( 1 <= n <= 1000 )
 *      - 이후 각 테스트 케이스는 2개의 값으로 이루어지며
 *        count는 반복 횟수 , w는 문자열
 * * 2. 조건 :
 *      - 각 문자 w를 count 만큼 반복시킨다.
 *      - 문자열은 알파벳 대문자로 이루어져 있다.
 * * 3. 전략 :
 *      - 반복 횟수와 문자열을 입력 받고, 각 문자에 대해 반복 횟수만큼 반복하여 출력한다.
 *      - 각 테스트 케이스별로 결과를 출력
 * * --------------------------------------------------------------------------------
 */
public class p2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
