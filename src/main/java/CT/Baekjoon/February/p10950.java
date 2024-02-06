package CT.Baekjoon.February;

/*
1.문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

2.입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

3.출력
각 테스트 케이스마다 A+B를 출력한다.
 */

import java.util.Scanner;

public class p10950 {
    public static void main(String[] args) {

        /* ( 1번 풀이 )
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i< T; T++ ){

            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);

         */

        /* ( 2번 풀이 ) 효율이 더 좋음
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int arr[] = new int[T];

        for( int i = 0 ; i<T; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            arr[i] = A+B;
        }
        for(int C : arr){
            System.out.println(C);


        }

         */
        }
}

