class Solution {
    public String solution(String cipher, int code) {
        
        StringBuilder sb = new StringBuilder();
        
        // i = code -1 부터 시작 code 간격으로 접근 
        for(int i= code -1; i< cipher.length(); i+=code){
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}