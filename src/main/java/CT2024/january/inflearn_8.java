package CT2024.january;

import java.util.Scanner;

/* 유요한 팰린드롬 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 한다.*/
/* 팰린드롬이면 "YES" 아니면 "NO" 출력하는 프로그램을 작성하시오  */
/* 단 회문을 검사할 떄 알파벳만 검사하고 대소문자를 따로 구분하지 않습니다. */
/* 알바펫 이외의 문자들은 모두 무시합니다 */

class inflearn_8 {
    public String solution(String s){

       String answer = "NO";
       s =s.toUpperCase().replaceAll("[^A-Z]", "");
       String tmp = new StringBuilder(s).reverse().toString();
       if (s.equals(tmp)) answer="YES";

       return answer ;

}

    public static void main(String[] args){
        inflearn_8 T = new inflearn_8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}