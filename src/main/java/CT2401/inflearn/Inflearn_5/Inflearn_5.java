package CT2401.inflearn.Inflearn_5;

import java.util.Scanner;

public class Inflearn_5 {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0 , rt = str.length()-1;
        while (lt < rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Inflearn_5 T = new Inflearn_5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
