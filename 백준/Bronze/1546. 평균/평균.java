
import java.io.*;


/**
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과목의 개수
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N]; // 넣을 배열
        // 각 과목의 시험 성적

        // 각 과목의 시험 성적 입력 처리 ( 공백 구분 )
        String[] input = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(input[i]);
        }

        double sum = 0;
        double max = 0;

        for(int i=0; i<N; i++){
            if(A[i] > max ) max = A[i];
            sum += A[i];
        }
        System.out.println(sum * 100 / max / N);
    }
}
