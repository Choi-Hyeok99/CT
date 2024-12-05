

/**
 *      # 문제 분석
 *          상근이 N개 여행
 *
 *      # 가장 적은 종류의 비행기를 타고 모든 국가 여행
 *
 *
 *
 *      # 입력
 *          테스트 케이스 = T ( 1 Line )
 *
 *          N ( 국가의 수 2<= N <= 100 ) 과 M (비행기의 종류 1<= M <= 100 ) ( 2 Line )
 *          a ,b 왕복하는 비행기가 있다는 것을 의미 (
 *
 *         주어지는 비행 스케줄은 항상 연결 그래프? ( LinkedList? )
 *
 *
 *     # 출력
 *           테스트 케이스마다 한줄 출력
 *           상근이가 모든 국가를 여행하기 위해 타야 하는 비행기 종류 최소 개수를 출력
 *
 *
 *     # 전략
 *     MST ( 최소 신장 트리 )
 *
 *
 *
 *
 *
 */


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 테스트 케이스 입력 받기
        int T = Integer.parseInt(br.readLine());



        while( T --> 0){
            st = new StringTokenizer(br.readLine());
            // N : 국가 수 , M : 항공 노선
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 간선 입력 ( 실제 연결은 필요 없지만 입력 형식에 맞춤 )
            for(int i = 0 ; i<M; i++){
                br.readLine();
            }

            // 결괓 출력 ( 최소 간선 수 = N - 1 )
            bw.write((N-1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
