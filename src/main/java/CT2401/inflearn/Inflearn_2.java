package CT2401.inflearn;



import java.util.Scanner;

public class Inflearn_2 {
    public static void main(String[] args) {
        Inflearn_2 T = new Inflearn_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));

    }
    // 방법 2
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()) {
            if(x>=97 && x<=122) answer+= (char)(x-32);
            else answer+= (char)(x+32);
        }

        return answer;

//        // 방법  1
//       for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
//            else answer+=Character.toLowerCase(x);
//        }
//        return answer;

    }
}

