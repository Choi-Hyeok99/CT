


import java.io.*;
import java.util.*;



public class Main {


    static int N,M,R;
    static List<Integer>[] graph; // 그래프
    static int[] visited; // 방문 순서 저장
    static int order = 1; // 방문 순서



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // N(정점의 개수)  , M(간선의 개수) , R( 시작 정점 )
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        // 그래프 초기화

        graph = new ArrayList[N+1];
        for(int i=0; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u); // 무방향 그래프이므로 양방향 간선 추가
        }

        // 그래프 정렬 (정점 번호 작은 순서대로 탐색하기 위해)
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // 방문 배열 초기화
        visited = new int[N + 1];

        // DFS 탐색
        dfs(R);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.print(sb);
    }
    private static void dfs(int node){
        visited[node] = order++; // 방문 순서 기록

        for(int next : graph[node]){
            if(visited[next] == 0){ // 아직 방문하지 않은 정점
                dfs(next); // 재귀 호출
            }
        }
    }
}
