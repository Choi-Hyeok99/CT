import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(Character.isDigit(c)){
                list.add(Character.getNumericValue(c));
            }
        }
        Collections.sort(list); // 리스트 정렬 
        
        return list.stream().mapToInt(Integer::intValue).toArray();
}
}