package CT2401.inflearn.Inflearn_3;

import java.util.Scanner;

public class Inflearn_3_2 {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE , pos;
        while ((pos = str.indexOf(' '))!=-1){
            String tmp = str.substring(0,pos); // subString 알아보기

            int len = tmp.length();
            if(len>m){  // 같디고하면 뒤쪽 단어로 대체됌 그래서 >= 안됌
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m) answer = str;
        return answer;

    }
    public static void main(String[] args) {
        Inflearn_3_2 T = new Inflearn_3_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();  // 한줄이기때문에 nextLine();
        System.out.print(T.solution(str));
    }
}
