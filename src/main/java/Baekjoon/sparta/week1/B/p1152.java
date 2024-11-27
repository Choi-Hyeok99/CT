package Baekjoon.sparta.week1.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 : 한 줄에 영어 대소문자와 공백으로 이루어진 문자열
 * * 2. 조건 :
 *      - 문자열은 공백으로 시작하거나 끝날 수 있다
 *      - 단어는 공백 하나로 구분되며, 공백이 연속해서 나오는 경우
 * * 3. 전략 :
 *      - 문자열에서 앞뒤 공백을 제거하고, 공백을 기준으로 단어들을 나눈다
 *      - 나누어진 단어 배열의 길이를 출력한다
 *      - 단어가 없을 경우 빈 배열이 되므로 그 경우는 0을 출력
 * * --------------------------------------------------------------------------------
 */
public class p1152 {
    public static void main(String[] args) throws IOException {

        // 대소문자와 공백인데 공백 하나 지나고 영어 나오면 단어 갯수 한개 증가.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String w = br.readLine();

        String[] words = w.trim().split("\\s+");

        if (words[0].isEmpty()){
            System.out.println(0);
        }
        else System.out.println(words.length);
    }
}
