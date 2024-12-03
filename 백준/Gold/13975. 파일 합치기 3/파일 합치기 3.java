import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 T
        int T  = Integer.parseInt(br.readLine());



        StringTokenizer st ;

        for(int i=0; i<T; i++){
            // 파일 수
            int K = Integer.parseInt(br.readLine());

            // 우선 순위 큐 사용 ( 최소 힙 )
            PriorityQueue<Long> pq = new PriorityQueue<>();


            st = new StringTokenizer(br.readLine());

            // 파일 크기 큐 삽입
            // Integer 사용 후 틀림 데이터 타입 변환 
            for(int j = 0; j<K; j++){
                pq.add(Long.parseLong(st.nextToken()));
            }

            long total = 0;

            // 파일의 갯수 하나남을떄까지 꺼내기
            while(pq.size() > 1 ){
                long file = pq.poll();
                long file2 = pq.poll();

                // 파일 합치기
                long plusTotal = file + file2 ;

                // 비용 갱신
                total += plusTotal;

                // 큐에 재 삽입
                pq.add(plusTotal);

            }
            bw.write(total+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
