import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        
        char[] c = my_string.toCharArray();
        
        Arrays.sort(c);
        
        return new String(c);
    }
}