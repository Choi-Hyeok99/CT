package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class DFS {

    static boolean[] visited = new boolean[7]; // 방문배열
    static ArrayList<Integer>[] A = new ArrayList[7]; // ArrayList 타입 배열
    static ArrayList<Integer> procedure = new ArrayList<>(); // 탐색 순서 list
    public static void main(String[] args) {

        for(int i=1; i<=6; i++ ){
            A[i] = new ArrayList<>();
        }
        A[1].add(2);
        A[1].add(3);
        A[2].add(5);
        A[2].add(6);
        A[3].add(4);
        A[4].add(6);

         DFS(1);

        System.out.println(procedure.toString());
    }
    // DFS 함수 정의
    static void DFS(int node) {
        visited[node] = true; // 현재 노드를 방문 처리
        procedure.add(node); // 탐색 순서에 현재 노드 추가

        // 현재 노드와 연결된 노드들에 대해
        for (int adjacentNode : A[node]) {
            if (!visited[adjacentNode]) { // 방문하지 않은 노드라면
                DFS(adjacentNode); // 재귀적으로 DFS 실행
            }
        }
    }
}
