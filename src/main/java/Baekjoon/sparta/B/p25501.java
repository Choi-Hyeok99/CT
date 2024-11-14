package Baekjoon.sparta.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.문제
 * 정휘는 후배들이 재귀 함수를 잘 다루는 재귀의 귀재인지 알아보기 위해 재귀 함수와 관련된 문제를 출제하기로 했다.
 *
 * 팰린드롬이란, 앞에서부터 읽었을 때와 뒤에서부터 읽었을 때가 같은 문자열을 말한다. 팰린드롬의 예시로 AAA, ABBA, ABABA 등이 있고, 팰린드롬이 아닌 문자열의 예시로 ABCA, PALINDROME 등이 있다.
 *
 * 어떤 문자열이 팰린드롬인지 판별하는 문제는 재귀 함수를 이용해 쉽게 해결할 수 있다. 아래 코드의 isPalindrome 함수는 주어진 문자열이 팰린드롬이면 1, 팰린드롬이 아니면 0을 반환하는 함수다.
 *
 *
 *
 * 2.입력
 *  첫째 줄에 테스트케이스의 개수 T가 주어진다. ( 1<= T <= 1000 )
 *  둘째 줄부터 T개의 알파벳 대문자로 구성된 문자열 S가 주어진다. ( 1<= |S| <= 1000 )
 *
 * 3.출력
 * 각 테스트케이스마다, isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수를 한 줄에 공백으로 구분하여 출력한다.
 *
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 : 첫쨰 줄에 Test Case 개수 T가 주어진다. , 각 Test Case마다 알파벳 대문자로 구성된 S가 주어진다.
 * * 2. 조건 : (팰린드롬 판별) , isPalindrome 함수로 팰린드롬 여부 확인
 * * 3. 전략 : 문자열의 양끝을 비교하는 사용 , count 변수로 함수 호출 횟수를 추척하고 출력
 * * --------------------------------------------------------------------------------
 */
public class p25501 {
    private static int count ; // isPalindrome 호출 횟수

    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 조건 + 출력
        for (int i=0; i<T; i++){
            count = 0;
            String s = br.readLine();
            int result = isPalindrome(s);
            System.out.println(result + " "+ count);
            System.out.flush();
        }
    }
    public static int isPalindrome(String s){
        count++;
        // 문자열 길이 0 or 1일 경우 무조건 팰린드롬
        if (s.length() <= 1) return 1;
        // 양 끝 문자를 비교하여 다르면 0 반환
        if(s.charAt(0) != s.charAt(s.length()-1)) return 0;
        // 양 끝 제외한 부분 문자열로 재귀 호출
        return isPalindrome(s.substring(1,s.length()-1));
    }
}
