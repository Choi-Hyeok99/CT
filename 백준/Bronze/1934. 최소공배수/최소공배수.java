/**
*    # A와 B가 존재
     # A와 B의 최소 공배수 구하는 프로그램 작성 
     # 1L = Test Case Count 
     # 2L = Test Case 
     # 유클리드 호제법 알고리즘 이용 
     
     유클리드 호제법을 이용해 빠르게 GCD(A, B) 계산
     LCM(A, B) = (A × B) / GCD(A, B)` 공식 적용
     입출력 최적화 (BufferedReader + StringBuilder)
*        
**/

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

         // 테스트 케이스 개수 입력
        int T = Integer.parseInt(br.readLine()); 

        // 
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int gcd = gcd(A, B);  // 최대공약수 구하기
            int lcm = (A * B) / gcd;  // 최소공배수 구하기

            sb.append(lcm).append("\n");  // 결과 저장
        }

        System.out.print(sb);  // 최종 결과 한 번에 출력
    }

    // 유클리드 호제법을 이용한 GCD(최대공약수)  (재귀 방식)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}