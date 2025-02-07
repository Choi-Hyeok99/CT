import java.io.*;

public class Main {
    static int[][] board = new int[19][19];
    static int[] dx = {0, 1, 1, -1}; // → ↓ ↘ ↗
    static int[] dy = {1, 0, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 바둑판 입력
        for (int i = 0; i < 19; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 19; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }

        // 오목 찾기
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (board[i][j] != 0) { // 흑(1) 또는 백(2)
                    int winner = board[i][j];

                    for (int d = 0; d < 4; d++) {
                        int nx = i - dx[d]; // 이전 돌 확인
                        int ny = j - dy[d];

                        // 이전 돌이 같은 색이면 중복 탐색 방지
                        if (isValid(nx, ny) && board[nx][ny] == winner) continue;

                        // 5개 연속인지 확인
                        if (countStones(i, j, d, winner) == 5) {
                            System.out.println(winner);
                            System.out.println((i + 1) + " " + (j + 1));
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(0); // 승부가 나지 않음
    }

    // 5개 연속인지 확인하는 함수
    private static int countStones(int x, int y, int d, int color) {
        int count = 1;
        int nx = x + dx[d];
        int ny = y + dy[d];

        while (isValid(nx, ny) && board[nx][ny] == color) {
            count++;
            nx += dx[d];
            ny += dy[d];
        }
        return count;
    }

    // 좌표가 범위 내에 있는지 확인하는 함수
    private static boolean isValid(int x, int y) {
        return x >= 0 && x < 19 && y >= 0 && y < 19;
    }
}