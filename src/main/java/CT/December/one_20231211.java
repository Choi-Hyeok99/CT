package CT.December;

import java.util.Scanner;

class one_20231211 {
    public int solution(String str , char t){
        int answer = 0;

        str= str.toUpperCase(); // String이 다 대문자로 변신
        t = Character.toUpperCase(t);

        // System.out.println(str);

        for(int i =0; i< str.length(); i++){
            if(str.charAt(i)==t)
            answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        one_20231211 T = new one_20231211();
        Scanner kb = new Scanner(System.in);

        String str =kb.next();

        char c = kb.next().charAt(0);

        System.out.print(T.solution(str,c));
    }
    // Test
}