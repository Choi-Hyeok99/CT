
import java.io.*;
import java.util.*;

/**
 *
 *
 * 산타가 , 차례대로 방문한 아이들과 거점지의 정보들이 주어졌을 떄 , 아이들이 준 선물들의 가치들을 출력하시오
 * 만약 없다면 -1 출력
 *
 * # 입력
 *  - 첫번 쨰 줄에는 아이들과 거점지를 방문한 횟수 n
 *  - 다음 줄 n줄에는 a가 들어오고 , 그 다음 a개의 숫자가 들어온다. 이는 거점지에서 a개의 선물을 충전하는 것이고, 그 숫자들이 선물의 가치이다.
 *      만약 a가 0 이라면 거점지가 아닌 아이들을 만난 것이다. 선물의 가치는 100,000보다 작은 양의 정수이다. (1<= a <= 500)
 * # 출력
 *  a가 0일 때마다, 아이들에게 준 선물의 가치를 출력하시오. 만약 줄 선물이 없다면 -1을 출력하라. 적어도 하나의 출력이 있음을 보장한다. ( 중복 제거 )
 *
 *
 * 예제 입력 1
 *      5 --> 아이들과 거점지의 정보
 *      0 -->  -1 출력
 *      2 3 2 -> 2번 3과 2 가치를 얻음
 *      0 --> 3 출력
 *      0 --> 2 출력
 *      0 --> 출력 X
 *
 *
 * 예제 출력 1
 *      -1
 *      3
 *      2
 *      -1
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 최대 가치로 선물 ( 우선순위 큐 사용 )
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // 방문횟수
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            // 선물 충전
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if( a == 0 ){

                if( pq.isEmpty()){
                    bw.write("-1\n");
                } else {
                    bw.write(pq.poll()+" \n");
                }
            } else {
                // 선물 충전
                for(int j=0; j<a; j++){
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
