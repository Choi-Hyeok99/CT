package Baekjoon.sparta.week1.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. 팩토리얼 문제 (간단 예시)
 *
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :  BufferedReader를 이용
 * * 2. 조건 : 함수( 생성 )
 * * 3. 전략 :
 * * 4. 팩토리얼 :
 *   - n!=n×(n−1)×(n−2)×...×1
 *   - 5! = 5 * 4 * 3 * 2 * 1 = 120
 *   - factorial(n)은 n이 1 이하일 때 1을 반환, 그 외 n * factorial(n-1)로 재귀 호출을 진행
 * * --------------------------------------------------------------------------------
 */

public class p10872 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));

        br.close();

    }

    public static int factorial(int N){

        if(N<=1){
            return 1;
        } else {
            return N * factorial(N-1);
        }

    }
}
