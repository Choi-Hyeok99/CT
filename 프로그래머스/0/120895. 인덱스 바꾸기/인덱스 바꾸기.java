class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char[] charArray = my_string.toCharArray(); // 문자열을 문자 배열로 변환
        
        
        // 두 문자의 위치 변경 
        char tmp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = tmp;
        
        return new String(charArray);
    }
}