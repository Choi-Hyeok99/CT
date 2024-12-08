
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // N입력 받기
        int N = Integer.parseInt(br.readLine());

        // 좋은 수 카운트
        int count = 0;

        // 배열 A 만들기
        int[] A = new int[N];

        // N만큼 A에 배열 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 A 정렬하기
        Arrays.sort(A);

        // 반복문을 이용하여 좋은 수 찾기
        for (int k = 0; k < N; k++) {
            long find = A[k];
            int start = 0;
            int end = N - 1;

            while (start < end) {

                if (A[start] + A[end] == find) {
                    if (start != k && end != k) {
                        count++;
                        break;
                    } else if (start == k) {
                        start++;
                    } else if (end == k) {
                        end--;
                    }
                } else if (A[start] + A[end] < find) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
