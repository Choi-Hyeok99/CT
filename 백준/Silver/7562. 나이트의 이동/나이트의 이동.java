
import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2}; // 나이트 이동 방향
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int l; // 체스판 크기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            
            l = Integer.parseInt(br.readLine()); // 체스판 크기
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int targetX = Integer.parseInt(st.nextToken());
            int targetY = Integer.parseInt(st.nextToken());

            sb.append(bfs(startX, startY, targetX, targetY)).append("\n");
        }
        System.out.println(sb);
    }

    static int bfs(int startX, int startY, int targetX, int targetY) {
        boolean[][] visited = new boolean[l][l]; // 방문 여부
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0}); // 시작 위치와 이동 횟수
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int moves = current[2];

            // 목표 위치에 도달한 경우
            if (x == targetX && y == targetY) {
                return moves;
            }

            // 8가지 방향으로 이동
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 체스판 범위 내에서만 이동
                if (nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, moves + 1});
                }
            }
        }
        return -1; // 도달 불가능한 경우 (문제 조건상 없음)
    }
}
