/**
 *
 *  # 문제 : 신입사원
 *
 *  # 1차서류 2차 면접시험
 *
 *  # 점수가 하나정도는 높아야하는데 둘다 낮으면 이제 끝인거지
 *
 *  # A B ->
 *
 *  # 입력
 *        ( 1Line )
 *      - T (1<= T <= 20)
 *      - 각 테스트 케이스 지원자의 숫자 N( 1<= N <= 100,000 )
 *        ( 2Line )
 *      -   각각의 지원자의 서류심사 성적, 면접 성적의 순위가 공백을 두고 한 줄에 주어진다. 두 성적 순위는 모두 1위부터 N위까지 동석차 없이 결정
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

        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());

        // 배열을 쓰고 거기서 서류면접 점수를 기준으로 이제 통과하면 되는거죠
        while(T --> 0) {

            int N = Integer.parseInt(br.readLine());
            int[][] resume = new int[N][2]; //

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                resume[i][0] = Integer.parseInt(st.nextToken()); // 서류
                resume[i][1] = Integer.parseInt(st.nextToken()); // 면접
            }

            // 서류 점수로 기준 ( 오름차순 정렬 )
            Arrays.sort(resume, Comparator.comparingInt(a -> a[0])); // 오름차순 정렬

            // 면접 점수를 비교합니다.
            int count = 0;
            int interview = Integer.MAX_VALUE; // 최소 면접 점수

            // 순회하면서 면접점수 비교 
            for (int i = 0; i < N; i++) {
                if (resume[i][1] < interview) {
                    count++;
                    interview = resume[i][1]; // 최소 면접 점수
                }
            }
            // 결과값 출력
            bw.write(count + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
