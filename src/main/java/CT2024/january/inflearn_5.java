package CT2024.january;
import java.util.*;
class inflearn_5 {
    public String solution(String str){
        String answer;

        char[] s = str.toCharArray();
        int lt= 0  , rt=str.length()-1;
        while (lt<rt) {
            if (!Character.isAlphabetic(s[lt])) lt++; // 알파벳이 아닐때
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);  // String화 시켜주는게 valueof

        return answer;
}

    public static void main(String[] args){
        inflearn_5 T = new inflearn_5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
