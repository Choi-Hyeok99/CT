import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> graph;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 도시의 개수
        int M = Integer.parseInt(st.nextToken()); // 도로의 개수
        int K = Integer.parseInt(st.nextToken()); // 목표 거리
        int X = Integer.parseInt(st.nextToken()); // 시작 도시

        // 그래프 초기화
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 도로 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph.get(A).add(B);
        }

        // 최단 거리 배열 초기화
        distance = new int[N + 1];
        Arrays.fill(distance, -1); // 모든 거리를 -1로 초기화
        distance[X] = 0; // 시작 도시의 거리는 0

        // BFS 탐색
        bfs(X);

        // 결과 처리
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (distance[i] == K) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(result); // 오름차순 정렬
            for (int city : result) {
                System.out.println(city);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph.get(current)) {
                if (distance[neighbor] == -1) { // 아직 방문하지 않은 도시
                    distance[neighbor] = distance[current] + 1;
                    queue.add(neighbor);
                }
            }
        }
    }
}
