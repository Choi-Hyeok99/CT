package Baekjoon.sparta.S;


import java.io.*;

/**
 * 문제 분석
 * --------------------------------------------------------------------------------
 * 1. 입력:
 *    - 여러 개의 테스트 케이스로 이루어진 문자열.
 *    - 각 문자열은 한 줄로 주어지며, 마지막 입력은 "end".
 *    - 입력 문자열은 소문자로만 이루어지며, 길이는 1 이상 20 이하.
 *
 * 2. 출력:
 *    - 각 테스트 케이스에 대해 "<word> is acceptable." 또는 "<word> is not acceptable."
 *    - 조건을 만족하면 "acceptable", 만족하지 않으면 "not acceptable".
 *
 * 3. 조건:
 *    - 조건 1: 문자열에 모음(a, e, i, o, u)이 반드시 하나 이상 포함되어야 한다.
 *    - 조건 2: 모음이 3개 연속이거나 자음이 3개 연속으로 오면 안 된다.
 *    - 조건 3: 같은 글자가 연속으로 두 번 나타나면 안 된다. 단, "ee"와 "oo"는 예외로 허용된다.
 *
 * 4. 전략:
 *    - 조건을 각각 독립된 함수로 구현하여 가독성과 유지보수를 용이하게 만든다.
 *    - `containsVowel`, `checkConsecutive`, `checkDoubleLetters` 함수로 조건 분리.
 * --------------------------------------------------------------------------------
 */
public class p4659_S5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = br.readLine()).equals("end")){
            if (isAcceptable(input)){
                System.out.println("<" + input + "> is acceptable.");
            }else {
                System.out.println("<" + input + "> is not acceptable.");
            }
        }
    }
    // 전체 조건을 검사하는 함수
    private static boolean isAcceptable(String word) {
        return containsVowel(word) && checkConsecutive(word) && checkDoubleLetters(word);
    }


    // 조건 1 : 모음이 하나 이상 포함되어 있는지 확인
    private static boolean containsVowel(String word){
        String vowels = "aeiou";
        for (char c : word.toCharArray()){ // word.toCharArray()는 문자열을 문자배열 char[]로 변환하는 동작
            if (vowels.indexOf(c) != -1){ // indexOf(char c) 메서드는 주어진 문자가 문자열(vowels) 안에서 처음 등장하는 위치(인덱스)를 반환합니다.
                return true;
            }
        }
        return false;
    }

    // 조건2 : 모음 || 자음 3번 연속인지 확인
    private static boolean checkConsecutive(String word) {
        String vowels = "aeiou";
        int vowelCount = 0, consonantCount = 0;

        for (char c : word.toCharArray()){
            if (vowels.indexOf(c) != -1){ // 모음이면 VowelCount++;
                vowelCount++;
                consonantCount = 0;
            } else { // 자음이면 consonantCount++;
                consonantCount++;
                vowelCount = 0;
            }

            // 만약 3연속이면 False 반환
            if (vowelCount == 3 || consonantCount ==3){
                return false;
            }
        }
        return true;
    }

    // 조건 3 : 같은 글자가 연속으로 두 번 오는지 확인 ( 예외 : ee , oo )
    private static boolean checkDoubleLetters(String word) {
        for (int i= 1; i< word.length(); i++){
            char prev = word.charAt(i-1); // 현재 문자 앞에 있는 문자
            char curr = word.charAt(i); // 현재 문자

            // 같은 글자가 연속으로 두 번 오면 False 반환  ( ee, oo 제외 )
            if (prev == curr && !(prev == 'e' || prev == 'o')){
                return false;
            }
        }
        return true;
    }
}
