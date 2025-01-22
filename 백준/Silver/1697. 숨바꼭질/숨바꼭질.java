import java.io.*;
import java.util.*;

public class Main {

    // 수빈이가 있는 위치 & 동생의 위치
    static int N,K;

    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 수빈 & 동생 위치 입력
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(bfs());
    }
    static int bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = 1; // 시작점 방문

        while(!queue.isEmpty()){
            int current = queue.poll();


            if(current == K){
                return visited[current] - 1; // 방문 시간에서 -1 해서 0 기반
            }

            int[] move = {current - 1, current + 1, current * 2};
            for(int i=0; i<move.length; i++){
                int next = move[i];


                if(next>=0 && next<= 100000 && visited[next] == 0){
                    queue.add(next);
                    visited[next] = visited[current] + 1;
                }
            }
        }
        return -1; // 동생을 찾을 수 없는 경우
    }
}