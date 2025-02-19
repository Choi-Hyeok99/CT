class Solution {
    public int solution(int num, int k) {
        
        String str = String.valueOf(num); // 숫자 -> 문자열 변환 
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) - '0' == k){ // char -> int 변환 후 비교 
                return i + 1;
            }
        }
        return -1;
    }
}