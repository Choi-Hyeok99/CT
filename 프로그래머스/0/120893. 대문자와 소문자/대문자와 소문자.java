class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++){
            
            char c = my_string.charAt(i); 
            
            if(Character.isUpperCase(c)){ // 대문자인지 확인 
                answer.append(Character.toLowerCase(c)); // 소문자로 변환
            } else if(Character.isLowerCase(c)){ // 소문자인지 확인 
                answer.append(Character.toUpperCase(c)); // 대문자로 변환 
            }
        }
        
        
        return answer.toString();
    }
}