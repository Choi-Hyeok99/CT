package Baekjoon.sparta.S;

import java.io.*;
import java.util.Arrays;

/**
 * 1. 문제
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 *
 * 2. 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 3. 출력
 * 첫째 줄부터 차례대로 별을 출력한다.
 */

public class p10994 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        char[][] star = star(n);
        //별리 그려져 있는 사각형 한변의 길이
        int size = (n-1)*4+1;

        //출력
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                sb.append(star[i][j]);
            }sb.append("\n");
        }
        System.out.println(sb.toString());

    }

    //재귀적으로 문제 해결
    public static char[][] star(int num){
        //인자인 num에 따른 별이 그려져 있는 사각형 한변의 길이
        int size = (num-1)*4+1;
        char[][] star = new char[size][size];

        //공백으로 초기화
        for(int i=0;i<size;i++) {
            Arrays.fill(star[i], ' ');
        }

        //가장 중앙에 있는 칸에 별
        if(num==1) {
            star[0][0]='*';
            return star;
        }

        //해당 사이즈의 사각형 안에 있는 별 찍기
        char[][] pre_star = star(num-1);
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                //최외곽에 별찍기
                if(i==0 || i==size-1 || j==0 || j==size-1) {
                    star[i][j]='*';
                }
                //내부에 있는 사각형에 대해서 별찍기, 최외곽과 그 다음 사각형에 사이에 있는 공백은 건너뜀
                else if(2<=i && i<size-2 && 2<=j && j<size-2) {
                    star[i][j]=pre_star[i-2][j-2];
                }
            }
        }
        return star;

    }
}