

/**
 *
 * 문제 분석 :
 *      - A[1] ...... 대해서 , 부 배열은 A[i],A[i+1],..... A[j-1],A[j] ( 단 1<= i <= j <= n  ) 을 말한다.
 *      - 이러한 부 배열의 합은 A[i] + ... + A[j] 를 의미한다.
 *      - 각원소가 정수인 두 배열 A[1],....A[n] 과 B[m]이 주어질때, A의 부 배열의 합에 B의 부 배열의 합을 더해 T가 되는 모든 부 배열의 쌍의
 *      - 개수를 구하시오
 *
 *      Ex) A{1,2,3,4} , B {1,3,2} , T = 5인경우 , 부 배열의 쌍의 개수는 다음의 7가지 경우가 있다.
 *
 *
 *      추측 :
 *            배열 + 쌍  => HashTable
 *
 *     # 입력
 *          - line 1 -> T가 주어진다.
 *          - line 2 -> n이 주어진다.
 *          - line 3 -> n개 정수로 A[1] ,.... A[n]
 *          - line 4 -> m이 주어진다.
 *          - line 5 -> B[1] , .... B[m]이 주어진다. 각각의 배열 원소는 절대값이 1,000,000을 넘지 않는 정수이다.
 *
 *    # 출력
 *      - 첫쨰 줄에 답을 출력한다. 가능한 경우가 한 가지도 없을 경우는 0을 출력한다.
 *
 *    # 특수 케이스
 *      - 가능 경우 X -> 0 출력
 *
 *
 *   # 부분 배열의 합
 *      -> T = 5 -> 목표 배열의 합
 *
 *
 *
 *
 *
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 목표 합 T
        int T = Integer.parseInt(br.readLine());

        // 배열 A 입력
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 B 입력
        int m = Integer.parseInt(br.readLine());
        int[] B = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // A의 부분 배열 합 빈도 계산
        Map<Integer, Integer> sumA = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) { // j는 항상 i부터 시작해야 함
                sum += A[j]; // 부분 배열 합 계산
                sumA.put(sum, sumA.getOrDefault(sum, 0) + 1); // 빈도 기록
            }
        }

        // B의 부분 배열 합 계산 및 결과 찾기
        long count = 0; // 결과는 long으로
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = i; j < m; j++) { // j는 항상 i부터 시작해야 함
                sum += B[j]; // 부분 배열 합 계산
                count += sumA.getOrDefault(T - sum, 0); // T - sum 만족하는 빈도 추가
            }
        }

        // 결과 출력
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
