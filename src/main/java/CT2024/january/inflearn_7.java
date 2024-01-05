package CT2024.january;
import java.util.Scanner;

/* 문제 7번 회모 문자열 : 회모문자열은 앞에서 읽을 때나 뒤에서 읽을 떄 같은 문자열을 회모 문자열이라고 한다. */
/* 대소문자 구분 X 회모문자열이 맞으면 YES 아니면 NO 출력문을 코딩하시오. */
/* 대칭 비교라고생각하면 좋을듯하다. */
class inflearn_7 {
    public String solution(String str){
    String answer = "YES";
    str= str.toUpperCase();
    int len = str.length();
    for(int i = 0 ; i<len/2; i++){
        if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
    }
    return answer;
}

    public static void main(String[] args){
        inflearn_7 T = new inflearn_7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
