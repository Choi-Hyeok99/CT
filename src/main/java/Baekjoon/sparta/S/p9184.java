package Baekjoon.sparta.S;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 문제 분석
 * --------------------------------------------------------------------------------
 * 1. 입력 : 세 개의 정수 ( a,b,c ) ( -50<= a,b,c <= 50 )
 * 2. 조건 : w(a,b,c)를 계산하는 문제 , 재귀 이용 중복 계산 방지를 위해 메모이제이션 기법 활용
 * 3. 전략 :
 *  - 메모이제이션 사용하여 이미 계산한 값은 다시 계산 x
 *  - w(a,b,c) 조건을 따라 재귀 호출, 중복 계산 방지 3D 배열 이용하여 저장
 * --------------------------------------------------------------------------------
 */
public class p9184 {


    static int[][][] me = new int[101][101][101];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if (a == -1 && b == -1 && c == -1) break;

            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
        }
    }
    public static int w(int a,int b,int c ){
        if (a <=0 || b<=0 || c<=0) return 1;
        if (a>20 || b>20 || c>20) return w(20,20,20);

        if (me[a + 50][b + 50][c + 50] != 0 ) return me[a + 50][b + 50][c + 50];

        if (a<b && b < c){
            me[a + 50][b + 50][c + 50] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            me[a + 50][b + 50][c + 50] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
        return me[a + 50][b + 50][c + 50];
    }
}
