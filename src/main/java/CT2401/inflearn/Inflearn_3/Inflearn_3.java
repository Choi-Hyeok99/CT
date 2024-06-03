package CT2401.inflearn.Inflearn_3;

import java.util.Scanner;

public class Inflearn_3 {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        Inflearn_3 T = new Inflearn_3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();  // 한줄이기때문에 nextLine();
        System.out.print(T.solution(str));
    }
}
