package CT.Baekjoon.Sequence;


import java.util.Scanner;

/*
1.문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

2.입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

3.출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

 */
import java.util.Scanner;

public class p10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 크기 입력 받기
        int N = sc.nextInt();
        int[] arr = new int[N];

        // 배열 요소 입력 받기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 최소값과 최대값 초기화
        int min = arr[0];
        int max = arr[0];

        // 최소값과 최대값 찾기
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 결과 출력
        System.out.println(min + " " + max);
    }
}

