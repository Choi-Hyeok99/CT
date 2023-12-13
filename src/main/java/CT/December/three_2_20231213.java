package CT.December;
import java.util.Scanner;
class three_2_20231213 {
    public String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE, pos;
        while ((pos=str.indexOf(' '))!=-1){

            String tmp = str.substring(0 , pos);
            int len = tmp.length();
            if(len>m) {
                m = len;
                answer = tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }
    public static void main(String[] args){
        three_2_20231213 T = new three_2_20231213();
        Scanner kb = new Scanner (System.in);
        String str = kb.nextLine(); // 단어를 한줄로 이어받아야해서 .nextLine 사용
        System.out.print(T.solution(str));
    }
}
