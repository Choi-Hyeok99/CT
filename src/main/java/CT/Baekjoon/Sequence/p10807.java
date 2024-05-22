package CT.Baekjoon.Sequence;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/*
1.문제
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

2.입력
첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

3.출력
첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

 */
public class p10807 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 사용자 입력을 받기 위한 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // count 변수 초기화 (특정 수의 출현 횟수를 세기 위해 사용)
        int count = 0;

        // 첫 번째 입력 줄에서 배열의 크기 N을 읽음
        int N = Integer.parseInt(br.readLine());

        // 크기가 N인 정수 배열 a를 생성
        int[] a = new int[N];

        // 두 번째 입력 줄에서 N개의 숫자를 공백으로 구분하여 읽음
        String[] inputs = br.readLine().split(" ");

        // inputs 배열에서 각 숫자를 정수로 변환하여 배열 a에 저장
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(inputs[i]);
        }

        // 세 번째 입력 줄에서 특정 숫자 b를 읽음
        int b = Integer.parseInt(br.readLine());

        // 배열 a를 순회하면서 b와 같은 값이 몇 번 등장하는지 세기
        for (int j = 0; j < a.length; j++) {
            if (b == a[j]) {
                count++; // b와 같은 값이 발견되면 count를 증가
            }
        }



        // b와 같은 값이 배열 a에 몇 번 등장했는지 출력
        System.out.println(count);
    }
}

//       Scanner 버전 (1)
//        Scanner sc = new Scanner(System.in);
//
//        int count = 0;
//        int N = sc.nextInt();
//        int arr[] = new int[N];
//
//        for ( int i = 0; i<N; i++){
//            arr[i] =sc.nextInt();
//        }
//        int b = sc.nextInt();
//
//        for ( int j =0; j<arr.length; j++){
//            if(b== arr[j]){
//                count++;
//            }
//        }
//        System.out.println(count);
