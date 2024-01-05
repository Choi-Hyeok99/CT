package CT2024.january;
import java.util.Scanner;

/*  숫자추출문제 : 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다. */
/*  만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다. */
/*  추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다 */
/* 문자열의 길이는 100을 넘지 않습니다. */
/* g0en2T0s8eSoft */

class inplearn_9 {
    public int solution(String s){
        int answer = 0;
        for( char x : s.toCharArray()){
            if ((x>=48 && x<=57)) answer = answer * 10 +(x-48); // ASCII 48~58은 숫자 0~9까지이다.
        }
    return answer;
}
public static void main(String[] args){
    inplearn_9 T = new inplearn_9();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    }
}
