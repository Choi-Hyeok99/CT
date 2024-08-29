package Baekjoon.B;

import java.util.Scanner;

public class p11005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int space = 0;
        String result = "";

        while (n > 0) {
            space = n % b;
            if(space >= 10){
                char c = (char) (space + 55);
                result += c;
            }  else{
                result += space;
            }
            n = n / b;
        }
        for (int i = result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }
    }
}
