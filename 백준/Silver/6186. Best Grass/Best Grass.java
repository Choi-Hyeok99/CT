
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // R과 C 입력
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] farm = new char[R][C]; // 농장 상태
        boolean[][] visit = new boolean[R][C]; // 방문 여부

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            if (line.length() != C) { // 입력 길이가 잘못된 경우
                throw new IOException("Input row length mismatch with C");
            }
            farm[i] = line.toCharArray();
        }

        // 방향 벡터
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int count = 0; // 풀 덩어리 개수 카운트
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visit[i][j] && farm[i][j] == '#') { // 방문하지 않은 풀일 경우
                    count++;
                    queue.add(new int[]{i, j});
                    visit[i][j] = true;

                    // BFS 실행
                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int x = current[0];
                        int y = current[1];

                        for (int d = 0; d < 4; d++) {
                            int nx = x + dx[d];
                            int ny = y + dy[d];

                            // 범위 체크 및 방문 여부 확인
                            if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visit[nx][ny] && farm[nx][ny] == '#') {
                                queue.add(new int[]{nx, ny});
                                visit[nx][ny] = true;
                            }
                        }
                    }
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
