/* 
    # 문제 설명:
      - 산성 용액(양의 정수)과 알칼리 용액(음의 정수)이 주어짐.
      - 두 용액을 혼합했을 때, 그 합이 0에 가장 가까운 두 용액을 찾아 출력.

    # 입력 조건:
      - N개의 용액이 주어지며, 정렬되지 않은 상태로 입력됨.

    # 출력 조건:
      - 두 용액의 값을 오름차순으로 출력.

    # 접근 방법:
      1. **정렬**:
         - 입력된 배열을 오름차순으로 정렬.
      2. **투 포인터**:
         - 배열의 가장 작은 값(start)과 가장 큰 값(end)을 기준으로 혼합.
         - 혼합 값이 0에 가까운 경우 결과 갱신.
         - 혼합 값이 0보다 크면 end를 왼쪽으로 이동(값 줄이기).
         - 혼합 값이 0보다 작으면 start를 오른쪽으로 이동(값 키우기).

    # 시간 복잡도:
      - 정렬: O(N log N)
      - 투 포인터 탐색: O(N)
      - 전체 시간 복잡도: O(N log N)
*/

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 용액의 수 ( N ) 
        int N = Integer.parseInt(br.readLine());        
        
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 정렬 
        Arrays.sort(arr);
        
        // 투 포인터 
        int start = 0;
        int end = N-1;
        
        // 결과 저장 변수
        
        int closestSum = Integer.MAX_VALUE; // 최소 합의 절대값
        int result_1 = 0, result_2 = 0; // 두 용액 값 
        
        // 투 포인터 탐색 
        while(start < end){
            int sum = arr[start] + arr[end];
            
            // 현재 합의 절대값이 최소값보다 작으면 갱신
            if(Math.abs(sum) < closestSum){
                closestSum = Math.abs(sum);
                result_1 = arr[start];
                result_2 = arr[end];
            }
            
            // 합이 0보다 크면 큰 값을 줄이기 위해 end 사용 
            if(sum > 0){
                end--;
            } 
             // 합이 0보다 작으면 작은 값을 키우기 위해 start 이동
            else if(sum < 0) {
                start++;
            }
            // 합이 정확히 0이라면 즉시 종료 (더 가까운 값은 없음)
            else {
                break;
            }
        }
        System.out.println(result_1+" "+ result_2);

    }
}