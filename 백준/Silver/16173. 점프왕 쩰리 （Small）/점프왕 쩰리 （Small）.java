
import java.io.*;
import java.util.*;


/**
 * 문제 분석
 *
 *      1. 항상 쩰리는 1,1 출발한다.
 *      2. 밑에 숫자를 통한 이동의 수 만큼 가능하다. 넘으면 안돼 딱 맞아야 한다.
 *      3. 왼쪽이나 위로 갈 수 없다.
 *      4. 오른쪽이나 밑으로만 가능하다.
 *      5. 게임판이 최대 3X3이니깐 밑에 숫자는 1~2까지만 가능하다 그 이상 이동은 불가능하다 라는걸 알수 있음
 *      6 내가 생각한 예측은 DFS해서 2이상의 숫자를 만나면 넘어가야해 탐색 끝 하지만 이제 마지막 전에 2를만나면 넘어가니깐 1이 있어야해 근처에
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        // N 게임 구역의 크기
        int N = Integer.parseInt(br.readLine());

        // 게임판 초가화
        int[][] board = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(bfs(board,N) ? "HaruHaru" : "Hing");
        bw.flush();
        bw.close();
        br.close();
    }
    private static boolean bfs(int[][] board , int N ){

        // 이동 방향을 줘야지 ( 오른쪽, 아래쪽 )
        int[] dx = {0,1};
        int[] dy = {1,0};

        boolean[][] visited = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0}); // 시작점
        visited[0][0] = true; //

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 현재 위치가 도착 지점 (-1)이라면 탐색 종료
            if(board[x][y] == -1){
                return true;
            }

            // 현재 칸에서 이동 가능한 거리
            int step = board[x][y];

            // 2방향으로 이동
            for(int d =0; d<2; d++){
                int nx = x + dx[d] * step;
                int ny = y + dy[d] * step;


                // 범위 및 방문 체크
                if(nx >= 0 && nx < N && ny>= 0 && ny<N && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});
                }
            }
        }
        return false;

    }
}
