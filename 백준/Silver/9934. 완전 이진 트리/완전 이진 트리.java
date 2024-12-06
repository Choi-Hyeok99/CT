
/**
 *
 *      # 문제 이해
 *          - 입력은 중위 순회
 *          - 완전 이진 트리의 특성을 알아야한다.
 *          - 트리의 높이 (K) 가 주어지며, 총 노드의 개수는 2^K - 1로 고정
 *          - 중위 순회 결과를 활용해 각 트리 레벨에 노드를 배치
 *
 *      # 문제 나누기
 *          - 1. 중위 순회(inorder Traversal)의 특성 이해
 *              - 완전 이진 트리의 중위 순회는 [왼쪽 서브트리 -> 루트 -> 오른쪽 서브트리 순서로 방문]
 *              - 입력 배열에서 중앙 값이  루트 노드가 됌
 *              - 중앙 값 기준으로 왼쪽은 왼쪽 서브트리 , 오른쪽은 오른쪽 서브트리로 구성
 *
 *          - 2. 트리 레벨 구성
 *              - 높이 K는 레벨 0 부터 K - 1 까지 존재
 *              - 루트 노드부터 차례대로 각 레벨에 배치
 *              - 재구적으로 서비스트리를 분할하면서 레벨별 노드에 저장
 *
 *     # 구현 계획
 *              - 1. 입력 받기
 *                  - 높이 K와 중위 순회 결과를 입력받음
 *
 *              - 2. 중위 순회 결과를 활용한 트리 생성
 *                  - 중앙값을 루트 노드로 설정하고, 나머지는 왼쪽 서브트리 , 오른쪽 서브트리로 분할
 *                  - 이를 재귀적으로 처리
 *
 *             - 3. 레벨별 출력
 *                  - 각 레벨에 해당하는 노드를 저장하고 출력
 *
 *
 *
 */

import java.io.*;
import java.util.*;

public class Main  {

    static List<List<Integer>> levels; // 각 레벨의 노드를 저장할 리스트

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // K 값 입력
        int K = Integer.parseInt(br.readLine());
        int N = ( 1 << K ) -1; // 노드 개수 : 2^K -1
        //
        int[] inorder = new int[N]; // N은 트리의 총 노드 개수

        // inorder 배열 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            inorder[i] = Integer.parseInt(st.nextToken());
        }

        // 레벨별로 노드를 저장할 리스트 초기화
        levels = new ArrayList<>();
        for(int i =0; i<K; i++){
            levels.add(new ArrayList<>()); // 각 레벨을 위한 리스트 생성
        }

        // 트리 구성
        buildTree(inorder, 0, N -1 , 0 );

        // 결과 출력
        for(List<Integer> level : levels){
            for(int node : level){
                bw.write(node + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static void buildTree(int[] inorder, int start , int end , int depth ){
        if(start > end ) return; // 유효 범위가 아니면 종료

        // 중간값을 루트로 설정
        int root = (start + end ) / 2 ;
        levels.get(depth).add(inorder[root]); // 해당 깊이에 노드 추가

        // 왼쪽 서브트리 처리
        buildTree(inorder, start , root-1,depth+1);

        // 오른쪽 서브트리 처리
        buildTree(inorder,root+1, end,depth + 1);
    }
}
