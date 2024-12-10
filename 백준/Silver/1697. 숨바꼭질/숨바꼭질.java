

/**
 *      # 문제 이해
 *          - 수빈이는 현재 점 N 에 있고 , 동생은 K에 있다. 수빈이는 걷거나 순간이동을 할 수 있따.
 *          - 만약 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 or X + 1로 이동하게 된다. 순간이동을 하는 경우에는 1초 후에 2 * X의 위치로 간다.
 *          - 수빈이와 동생의 위치가 주어졌을때 , 수빈이가 동생을 찾을 수 있는 가장 빠른 시간잉 몇초 후 인지 구하는 프로그램을 작성하시오
 *
 *
 *     # 입력
 *          첫 번째 줄에 수빈이가 있는 위치 N과 동생 위치 K가 주어주니다. ( 정수 )
 *
 *     # 출력
 *          수빈이가 동생을 찾는 가장 빠른 시간을 출력한다.
 *
 *
 *     #
 */
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
