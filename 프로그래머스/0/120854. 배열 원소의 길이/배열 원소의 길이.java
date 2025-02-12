class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i=0; i< strlist.length; i++){
            answer[i] = strlist[i].length(); // 각 문자열 길이 저장
        }
        return answer;
    }
}