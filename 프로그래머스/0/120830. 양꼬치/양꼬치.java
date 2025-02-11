class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int Y = 12000 * n ;
        int B = 2000 * k; 
        int S = n / 10; 
        int Sc = S * 2000;
        answer = Y + B - Sc;
        return answer;
    }
}