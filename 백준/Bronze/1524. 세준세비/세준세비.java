
import java.io.*;
import java.util.*;

/**
 *
 * 세준 : N명의 병사
 * 세비 : M명의 병사
 *
 *
 * # 입력
 *      - 1Line 테스트 케이스 T ( T <= 100 )
 *      - 1Line N 과 M이 들어옴
 *      - 2Line 세준 병사 : 힘 ( 정수 )
 *      - 3Line 세비 병사 : 힘 ( 정수 )
 *
 * # 출력
 *      - 각 테스트 케이스에 대해서 한 줄에 하나씩 차례대로 승자를 출력한다 세준 : S , 세비 : B 둘다 아니면 C
 *
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String L = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int Smax = 0;

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int S = Integer.parseInt(st.nextToken());

                if(Smax < S)  Smax = S;
            }

            int Bmax = 0;
            st = new StringTokenizer(br.readLine());
            for(int k =0; k<M; k++){
                int B = Integer.parseInt(st.nextToken());

                if(Bmax < B)  Bmax = B;
            }
            if(Smax > Bmax) System.out.println("S");
            else if(Bmax > Smax) System.out.println("B");
            else System.out.println("S");
        }
    }
}
