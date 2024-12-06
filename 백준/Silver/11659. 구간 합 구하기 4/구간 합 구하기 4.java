
/**
 * # 문제 분석
 *      - 수 N개가 주어졌을 때, i번쨰 부터 j번쨰 수까지 합을 구하는 ㅍ로그램을 작성하시오.
 *
 * # 입력
 *      - 첫째 줄에 수의 개수 N과 합을 구해야하는 횟수 M이 주어진다.
 *      - 둘쨰 줄에는 N개의 수가 주어진다. 수는 1000보다 작거나 같은 자연수
 *      - 셋째 줄에는 합을 구해야하는 구간 i,j가 주어진다.
 *
 *
 *
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        // N 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] S = new long[N + 1]; // 합 배열 공식

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            bw.write(S[j] - S[i - 1] + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
