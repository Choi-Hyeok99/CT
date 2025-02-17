class Solution {
    public int[] solution(int[] numbers) {
        
        int n = numbers.length; // 배열의 길이 저장 
        int answer[] = new int[n]; // 길이가 n인 새로운 배열 생성
        
        for(int i=0; i<numbers.length; i++){ // 반복문으로 각 요소를 2배로 변환
            
            answer[i] = numbers[i] * 2;
        }   
        return answer;
    }
}