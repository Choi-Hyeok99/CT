import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N, M 입력 받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 체스판 입력 받기
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE; // 최소 칠해야 하는 개수

        // 가능한 8x8 시작점 찾기 (N-7, M-7 범위)
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minPaint = Math.min(minPaint, countRepaints(board, i, j));
            }
        }

        // 최소 칠해야 하는 개수 출력
        System.out.println(minPaint);
    }

    // 8x8 체스판에서 최소 칠해야 하는 개수 계산
    public static int countRepaints(char[][] board, int x, int y) {
        int repaintBlack = 0; // 'B'로 시작하는 체스판과 비교
        int repaintWhite = 0; // 'W'로 시작하는 체스판과 비교

        // 8x8 검사
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[x + i][y + j];

                // 체스판 패턴에 맞게 칠해야 하는 경우를 체크
                if ((i + j) % 2 == 0) { // 짝수 칸
                    if (current != 'B') repaintBlack++; // BWBWBWBW 시작
                    if (current != 'W') repaintWhite++; // WBWBWBWB 시작
                } else { // 홀수 칸
                    if (current != 'W') repaintBlack++;
                    if (current != 'B') repaintWhite++;
                }
            }
        }

        // 두 패턴 중 더 적게 칠하는 경우 선택
        return Math.min(repaintBlack, repaintWhite);
    }
}