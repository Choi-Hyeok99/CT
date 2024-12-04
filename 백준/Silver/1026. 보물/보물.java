import java.io.*;
import java.util.*;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        
        // N과 A랑 B 입력 
        int N  = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        Integer[] B = new Integer[N];
        
        // A를 배열에 넣자
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        // B를 배열에 넣자
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        // S의 최솟값을 구해야하니깐 
        int S = 0;
        
        Arrays.sort(A); // 오름차순 0 1 1 1 6 
         
        Arrays.sort(B, Comparator.reverseOrder()); // 내림차순 8 7 3 2 1  = 18 
        
        for(int i = 0; i<N; i++){
            S+= A[i] * B[i];
        }
        bw.write(S + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}