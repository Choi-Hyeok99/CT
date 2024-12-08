
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수열의 수
        int M = Integer.parseInt(st.nextToken()); // 나누어떨어져야 하는 수

        // 합 배열 S 선언
        long[] S = new long[N];
        // 같은 나머지 인덱스를 카운트하는 배열
        long[] C = new long[M];
        long answer = 0; // 정답

        st = new StringTokenizer(br.readLine());
        S[0] = Integer.parseInt(st.nextToken());
        for(int i= 1; i<N; i++){ // 수열 합 배열 만들기
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){ // 합 배열의 모든 값에 % 연산 수행하기
            int remainder = (int) (S[i] % M) ;

            if(remainder == 0) answer++;   // 0~i 까지의 구간 합 자체가 0일때 정답 더하기

            C[remainder]++;// 나머지가 같은 인덱스 개수 카운팅
        }
        for(int i=0; i<M; i++){
            if(C[i] > 1){
                // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기
                answer = answer + (C[i] * (C[i] -1 ) / 2);
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
