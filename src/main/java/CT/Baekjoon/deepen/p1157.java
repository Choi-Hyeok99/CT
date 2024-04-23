package CT.Baekjoon.deepen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

1.문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

2.입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

3.출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

 */
public class p1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] ar = new int[26];

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                ar[str.charAt(i) - 'A'] += 1;
            } else {
                ar[str.charAt(i) - 'a'] += 1;
            }
        }
        int max = -1;
        char result = '?';

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                result = (char) (i + 65);
            } else if (ar[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }

}


