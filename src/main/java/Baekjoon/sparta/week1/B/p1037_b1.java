package Baekjoon.sparta.week1.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1037_b1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min , arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(max*min);
    }
}
