package CT.Baekjoon.Repetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//public class p2439 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N - (i + 1); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
public class p2439{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        for(int i = 1; i<10; i++){

            System.out.println(A * i);

        }

    }
}

