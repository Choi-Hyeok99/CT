package Baekjoon.sparta.week1.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 1.문제
 * 컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다. 고유번호의 처음 5자리에는 00000부터 99999까지의 수 중
 * 하나가 주어지며 6번째 자리에는 검증수가 들어간다. 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
 *
 * 예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
 *
 * 2. 입력
 * 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
 *
 * 3. 출력
 * 첫째 줄에 검증수를 출력한다.
 *
 * 문제 분석
 * --------------------------------------------------------------------------------
 * * 1. 입력 : 5개의 정수가 한 줄에 주어짐
 * * 2. 조건 : 5개의 정수를 각각 제곱 , 더하고 그 값을 10으로 나눈다. 나머지 출력
 * * 3. 전략
 * : 입력값을 공백으로 구분하여 읽어오기.
 * : 각 정수를 제곱하고 그 값을 합산.
 * : 합산된 값에 대해 10으로 나눈 나머지를 구하고 출력.
 * --------------------------------------------------------------------------------
 */
public class p2475 {
    public static void main(String[] args) throws IOException {

        /**
         * 1번 풀이
         */

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] input = br.readLine().split(" ");
//        int sum = 0;
//
//        for (String num : input){
//            sum += Integer.parseInt(num) * Integer.parseInt(num);
//        }
//
//        System.out.println(sum % 10);

        /**
         * 2번 풀이
         */

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i=0; i<5; i++){
            int num = sc.nextInt();
            sum += (int)Math.pow(num,2);
        }
        System.out.println((sum % 10));

    }
}
