package CT.December;
import java.util.Scanner;
class three_20231213 {
    public String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE;
        String[] s=str.split(" ");
        for(String x : s){
            int len = x.length();
            if (len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        three_20231213 T = new three_20231213();
        Scanner kb = new Scanner (System.in);
        String str = kb.nextLine(); // 단어를 한줄로 이어받아야해서 .nextLine 사용
        System.out.print(T.solution(str));
    }
}
