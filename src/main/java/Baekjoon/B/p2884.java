package Baekjoon.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *
 */
public class p2884 {
    public static void main(String[] args) throws IOException {

        /**
         *
         * 범위 : 0<= H <= 23
         *       0<= M <= 59
         *
         *       조건 :  설정 시간 - 45
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] time = br.readLine().split(" ");
        int H = Integer.parseInt(time[0]);
        int M = Integer.parseInt(time[1]);

        if(M < 45){
            H -= 1; // 시를 한시간 줄인다.
            M += 60;  // 분에 60을 더한다.
        }

        if (H < 0){
            H = 23;
        }

        System.out.println(H + " " + (M - 45 ));
    }
}
