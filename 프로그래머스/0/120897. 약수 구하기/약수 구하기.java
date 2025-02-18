import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>(); // 약수의 크기는 알 수 없어 동적으로 
        
        for(int i=1; i<=n; i++){
            if(n % i == 0) {
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray(); 
        // List -> int[]
    }
}