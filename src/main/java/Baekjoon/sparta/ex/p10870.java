package Baekjoon.sparta.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 1. 문제
 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 *
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
 *
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 *
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 *
 *
 * 2. 입력
 * 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 *
 *
 * 3. 출력
 * 첫째 줄에 n번째 피보나치 수를 출력한다.
 *
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 : 정수 n이 입력으로 주어지며, n은 0 이상 20 이하의 값이다.
 * * 2. 조건 : 피보나치 F(0) = 0, F(1) = 1 , F(n) = F(n-1) + F(n-2)
 * * 3. 전략 :
 *   - 재귀함수를 이용하여 피보나치 수열의 n번째 값을 계산한다
 * * --------------------------------------------------------------------------------
 */
public class p10870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));

    }

    public static int fibonacci(int n){

        if(n<=1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
