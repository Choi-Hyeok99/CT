import java.io.*;
import java.util.*;


public class Main {
    static int N , M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // N과 M을 배열 A 생성  입력
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        // N의 배열을 입력 받는다
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken()); // 배열안에 숫자 추가
        }
        Arrays.sort(A); // 정렬

        // start 와 end , sum , count 선언
        int start = 0;
        int end = N-1;
        int sum = 0;
        int count = 0;
        // while 반복문을 통해 몇개를 만들 수 있는지 선언
        while( start < end ){
            if(A[start] + A[end] < M){
                start++;
            } else if( A[start] + A[end] > M){
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
    }
}
