import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        
        List<Integer> list = new ArrayList<>(); // 결과 저장 리스트
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n ==0 ){
               list.add(numlist[i]); // 리스트에 저장 
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}