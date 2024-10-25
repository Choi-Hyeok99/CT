package Baekjoon.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 배열
 */
public class pP10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int X = Integer.parseInt(num[1]);

        String[] seq = br.readLine().split(" ");

        StringBuilder result = new StringBuilder();

        for (int i=0; i<N; i++){
            int A = Integer.parseInt(seq[i]);

            if (A < X ){
                result.append(A).append(" ");
            }
        }

        System.out.println(result.toString().trim());

    }
}
