class Solution {
    public int solution(String my_string) {
        
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++){
            
            char c = my_string.charAt(i); // 하나하나씩 추출. 
            
            if(Character.isDigit(c)){ // 숫자인지 확인 
                answer+= Character.getNumericValue(c); // // 숫자로 변환 후 합산
            }
            
        }
        return answer;
    }
}