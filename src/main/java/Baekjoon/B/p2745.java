package Baekjoon.B;

/*
1.문제
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35


2.입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.


3.출력
첫째 줄에 B진법 수 N을 10진법으로 출력한다.


4.예제 입력

ex)
ZZZZZ 36

출력)
60466175
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class p2745 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        StringTokenizer st = new StringTokenizer(sc.nextLine());
//        String n = st.nextToken();
//        int b = Integer.parseInt(st.nextToken());
//
//        System.out.println(Integer.parseInt(n,b));

        // 시간이 너무 오래걸림
        // 다른 코드 사용이 필요할듯

        String n = sc.next();
        int b = sc.nextInt();

        int result = 0;
        int power = 1; // 가중치 필수!

        // 문자열의 끝에서부터 각 자리의 값을 계산

        for(int i = n.length()-1; i>=0; i--){
            char c = n.charAt(i);

            if(c >= '0' && c<='9'){
                result += (c - 0) * power;
            } else if( c>= 'A' && c<= 'Z'){
                result+= (c-'A' + 10) * power;
            }
            power*=b;
        }
        System.out.println(result);
    }
}
