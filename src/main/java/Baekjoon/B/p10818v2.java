package Baekjoon.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N개의 정수가 주어진다. 이때 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 첫번째 줄에 정수의 개수 N개
 * 두번째 줄에 N개의 정수를 공백으로 구분해서 주어진다.
 */
public class p10818v2 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int arr[] = new int[N];

        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int MAX = arr[0];
        int MIN = arr[0];

        for(int i=0; i< arr.length; i++){
            if(arr[i] > MAX ) MAX = arr[i];
            if (arr[i]< MIN ) MIN = arr[i];
        }
        System.out.println(MIN + " " +MAX);

    }
}
