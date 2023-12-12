package CT.December;
import java.util.*;
class two_20231212 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) // String이 문자별로 전환 .toCharArray()
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);

        return answer;
    }


    public static void main(String[] args){
        two_20231212 T = new two_20231212();
        Scanner kb = new Scanner (System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}