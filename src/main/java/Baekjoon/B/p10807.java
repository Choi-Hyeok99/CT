package Baekjoon.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 1.문제
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 *
 * 2.입력
 * 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
 *
 * 3.출력
 * 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
 */

public class p10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 정수의 갯수
        int N = Integer.parseInt(br.readLine());

        // 두번쨰 : N개의 정수
        String[] numbers = br.readLine().split(" ");
        int[] Arr = new int[N];

        for(int i=0; i<N; i++){
            Arr[i] = Integer.parseInt(numbers[i]);
        }

        // 찾으려는 정수
        int v = Integer.parseInt(br.readLine());

        int count = 0;

        // 배열을 반복하여 v와 같은 숫자를 찾기
        for(int i=0; i<N; i++){
            if(Arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
    }
}
