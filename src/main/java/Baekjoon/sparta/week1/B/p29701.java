package Baekjoon.sparta.week1.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 모스 부호 해석할 수 있는 개수 n 입력
 *      - 모스 부호 문자열
 * * 2. 조건 :
 *      - 단일 문자 표현
 *      - 모스 부호 해석하여 출력
 * * 3. 전략 :
 *      - HashMap을 이용하여 대응되는 문자로 변환
 * * --------------------------------------------------------------------------------
 */
public class p29701 {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> morse = new HashMap<>();
        morse.put(".-","A");
        morse.put("-...","B");
        morse.put("-.-.","C");
        morse.put("-..","D");
        morse.put(".","E");
        morse.put("..-.","F");
        morse.put("--.","G");
        morse.put("....","H");
        morse.put("..","I");
        morse.put(".---","J");
        morse.put("-.-","K");
        morse.put(".-..","L");
        morse.put("--","M");
        morse.put("-.","N");
        morse.put("---","O");
        morse.put(".--.","P");
        morse.put("--.-","Q");
        morse.put(".-.","R");
        morse.put("...","S");
        morse.put("-","T");
        morse.put("..-","U");
        morse.put("...-","V");
        morse.put(".--","W");
        morse.put("-..-","X");
        morse.put("-.--","Y");
        morse.put("--..","Z");
        morse.put(".----","1");
        morse.put("..---","2");
        morse.put("...--","3");
        morse.put("....-","4");
        morse.put(".....","5");
        morse.put("-....","6");
        morse.put("--...","7");
        morse.put("---..","8");
        morse.put("----.","9");
        morse.put("-----","0");
        morse.put("--..--",",");
        morse.put(".-.-.-",".");
        morse.put("..--..","?");
        morse.put("---...",":");
        morse.put("-....-","-");
        morse.put(".--.-.","@");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] code = br.readLine().split(" ");

        for (String codes : code ){
            System.out.print(morse.get(codes));
        }
    }
}
