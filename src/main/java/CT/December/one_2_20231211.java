package CT.December;
import java.util.*;

class one_2_20231211 {
    public int solution(String str , char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for( char x : str.toCharArray()) {  // 문자 한개 한개를 분리시켜 문자 배열을 생성
            if (x == t)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        one_2_20231211 T = new one_2_20231211();
        Scanner kb = new Scanner(System.in);

        String str =kb.next();

        char c = kb.next().charAt(0);

        System.out.print(T.solution(str,c));
    }
}