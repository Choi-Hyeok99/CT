import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 처리
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int count = 0; // 사용한 뿅망치 횟수

        // 뿅망치 사용
        while (T-- > 0) {
            int maxHeight = pq.peek();

            // 거인의 키가 센티보다 작거나 뿅망치로 줄일 수 없는 경우 중단
            if (maxHeight < H || maxHeight == 1) {
                break;
            }

            pq.poll(); // 가장 큰 거인 제거
            pq.add(maxHeight / 2); // 뿅망치 사용 후 줄어든 키 추가
            count++;
        }

        if (pq.peek() < H) {
            bw.write("YES\n" + count + "\n");
        } else {
            bw.write("NO\n" + pq.peek() + "\n"); // 가장 큰 거인의 키 출력
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
