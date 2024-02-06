package CT.Baekjoon.February;


import java.util.Scanner;

/*
1.문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

2.입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

3.출력
1부터 n까지 합을 출력한다.
 */
public class p8393 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;


        for ( int i=0; i <= n ; i++){

            result += i;

        }
        System.out.println(result);
    }
}
