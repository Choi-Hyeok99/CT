package CT2401.inflearn.Inflearn_6;

import java.util.Scanner;

public class Inflearn_6 {
    public String solution(String str){
        String answer  = "";

        for(int i=0; i<str.length(); i++){
            //   System.out.println(str.charAt(i)+ " " + i +" " +str.indexOf(str.charAt(i)));

            if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i); // indexof 알아보기
        }
        return answer;
    }
    public static void main(String[] args) {
        Inflearn_6 T = new Inflearn_6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
