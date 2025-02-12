class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n]; // 결과 배열 생성 
        
        for(int i=0; i<n; i++){
            answer[i] = num_list[n - 1 - i]; // 역순으로 저장
        }
        return answer; 
    }
}