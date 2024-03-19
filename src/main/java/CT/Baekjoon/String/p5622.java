package CT.Baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5622 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int a = 0;
        int b = str.length();
        for(int i = 0; i<b; i++){ // 문자열 길이만큼 반복문 실행
            switch(str.charAt(i)){
                // switch 문을 선언 >> str의 문자가 차례대로 입력됨
                // charAt >> String 문자열 중에서 한글자만 char 타입으로 반환함
                // 즉, 입력 받은 알파벳이 i개라면 i개의 char로 반환함
                case 'A' : case 'B' : case 'C' :
                    a += 3;
                    break;
                // 입력하는 값이 A,B,C 인 경우에만 조건문이 실행

                case 'D' : case 'E' : case 'F' :
                    a += 4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    a += 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    a += 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    a += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    a += 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    a += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    a += 10;
                    break;
            }
        }
        System.out.print(a);
    }
}
