/*
	1.	입력
	•	N개의 좌표가 주어집니다.
	•	M개의 구간(시작점, 끝점)이 주어집니다.
    
    2.	목표
	•	각 구간에 대해 N개의 좌표 중 몇 개가 해당 구간에 포함되는지 계산합니다.
    
    3. 효율적 접근 필요성
	•	단순히 모든 좌표를 반복적으로 검사하면 시간복잡도가 O(N × M)이 되어 비효율적입니다.
	•	따라서 이분 탐색을 활용해 각 구간에 대해 포함되는 점의 개수를 효율적으로 계산해야 합니다.
    
    
*/

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // N과 M 입력 받기 
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        
        // N의 점 좌표 입력 
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 정렬 
        Arrays.sort(arr); 
        
        // M의 시작점과 끝점 입력 받기 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            
            // 구간 내 좌표 개수 개산 
            int count = upperBound(arr,end) - lowerBound(arr,start);
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
    }
    
    // lowerBound : start 이상인 첫 번째 위치 찾기
    private static int lowerBound(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid =(left + right) / 2;
            if(arr[mid] >= target){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    // upperBound : end 초과인 첫 번째 위치 찾기
    private static int upperBound(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while( left < right ){
            int mid = (left + right) / 2;
            if(arr[mid] > target){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}