class Solution {
    public int solution(int order) {
        
        
        int count = 0; 
        
        String str = String.valueOf(order); // 숫자를 문자열로 변환 
        
        for(char c : str.toCharArray()) { // 문자열을 순회 
            if( c == '3' || c == '6' || c == '9'){
                count++;
            }
        }
        
        return count;
    }
}