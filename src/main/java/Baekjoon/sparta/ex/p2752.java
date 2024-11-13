package Baekjoon.sparta.ex;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1. 문제
 * 동규는 세수를 하다가 정렬이 하고 싶어졌다.
 *
 * 정수 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어졌다.
 *
 * 정수 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.
 *
 * 2. 입력
 * 정수 세 개가 주어진다. 이 수는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 수는 모두 다르다.
 *
 * 3. 출력
 * 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
 *
 *
 */
public class p2752 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int[] num = {a,b,c};

        Arrays.sort(num);
        for (int result : num) {
            System.out.print(result + " ");
        }
    }
}
