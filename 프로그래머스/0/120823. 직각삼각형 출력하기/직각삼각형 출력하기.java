import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuilder sb = new StringBuilder(); // 문자열 저장용
        
        for(int i=0; i<n; i++){
            sb.append("*");
            System.out.println(sb.toString());
        }
    }
}