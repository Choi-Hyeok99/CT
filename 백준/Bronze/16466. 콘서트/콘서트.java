
/**
 *
 * HCPC 한양 ( 최고의 가수 칭호 )
 *
 *  # 입력
 *      - 1Line 1차 티켓팅에서 팔린 티켓들의 수 정수 N ( 1<= N <= 1,000,000 )
 *      - 2Line 1차 티켓팅에서 팔린 티켓들의 번호 정수 A가 주어진다. ( 1<=A<=2^31-1 )
 *
 *
 *  # 출력
 *      - 2차 티켓팅에서 양한이가 가질 수 있는 티켓 중 가장 작은 번호를 출력
 *
 *
 *  # Ex
 *    입력
 *      5
 *      4 1 2 7 8
 *      ( 팔린게 5장 ) ( 남은 번호 1 2 4 7 8 )
 *
 *    출력
 *      3
 *
 *    전략
 *     1 부터 시작 인데 팔린 티켓들의 번호를 제외한 가장 작은 수 N
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N을 받자
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){

            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int count = 0;
        for (int i=0; i<N; i++){
            if(arr[i] != i+1){
                bw.write(i+1 + "\n");
                count++;
                break;
            }
        }
        if (count == 0){
            bw.write(N+1+ "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
