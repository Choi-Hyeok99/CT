
/**
 *
 *
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N과 M을 입력받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 선언
        int[][] A = new int[N+1][N+1];

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // int D[][] 선언 ( 구간 합 구하기 )
        int[][] D = new int[N + 1][N + 1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<= N; j++){
                // 2차원 배열에서의 구간합 공식
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            // 구간 합 배열로 질의 답변
            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            bw.write(result+ "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
