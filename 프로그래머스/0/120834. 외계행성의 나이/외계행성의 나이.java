class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        
        String str = String.valueOf(age); // 숫자를 문자열로 변환 
        
        for(char c : str.toCharArray()){ // 문자열을 문자 하나씩 확인 
            sb.append((char) ('a' + (c - '0'))); // ASCII코드 생각하면 쉬움
        }
        return sb.toString();
    }
}