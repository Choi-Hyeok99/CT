package Baekjoon.B;

import java.util.Scanner;

/*
1. 문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.


2.입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

3.출력
주어진 수들 중 소수의 개수를 출력한다.

4. 예제 입력 1
4
1 3 5 7

4-1. 예제 출력 1
3

 */
public class p1978 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int box = 0;
        for(int i=0; i<count; i++){
            int a = sc.nextInt();

            if(a==1){
                box+=0;
                continue;
            }

            int r = 0;
            for(int j = 2; j < a ; j++){
                if(a % j ==0 ){
                    r++;
                }
            }
            if(r == 0){
                box++;
            }
        }
        System.out.println(box);
    }
}
