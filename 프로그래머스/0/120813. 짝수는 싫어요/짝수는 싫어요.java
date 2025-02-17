class Solution {
    public int[] solution(int n) {
        int count = (n + 1) / 2; // 1부터 n까지의 홀수 개수를 계산 (예: n=10이면 5개의 홀수)
        
        int[] answer = new int[count]; // 계산된 홀수 개수만큼 크기의 배열 생성
        
        int index = 0; 

        for (int i = 1; i <= n; i += 2) { // i를 1부터 시작하여 2씩 증가 (즉, 홀수만 순회)
            answer[index++] = i; // 현재 홀수를 배열에 저장한 후 index 증가
        }

        return answer; // 최종적으로 생성된 홀수 배열 반환
    }
}