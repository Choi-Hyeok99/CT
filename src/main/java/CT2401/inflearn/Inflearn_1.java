package CT2401.inflearn;


import org.example.Main;

import java.util.Scanner;

/* 문자 찾기 ( 대소문자 구분 X )  */
public class Inflearn_1 {
    public static void main(String[] args) {
        Inflearn_1 T = new Inflearn_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); // charAt 알아보기

        System.out.print(T.solution(str, c));
    }
    public int solution (String str , char t){
        int answer =0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 방법 1
//        for(int i =0; i<str.length(); i++){
//            if(str.charAt(i) == t){
//                answer++;
//            }
//        }
        // 방법 2
        for (char x : str.toCharArray()){
            if(x==t){
                answer++;
            }
        }
        return  answer;
    }
}
