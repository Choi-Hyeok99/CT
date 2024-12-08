
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N의 값 내려 받기
        int N = Integer.parseInt(br.readLine());

        // 숫자의 합이 N인 경우 카운트
        int count = 1; // 자기 자신만 포함하는 경우 미리 포함

        // start_index
        int start_index = 1;
        // end_index
        int end_index = 1;
        // sum
        int sum = 1;

        while(end_index != N){
            if(sum == N){ // 현재 연속 값이 N과 같은 경우
                count++;
                end_index++;
                sum = sum + end_index;
            } else if ( sum > N ){ // 현재 연속 값이 N보다 큰 경우
                sum = sum - start_index;
                start_index++;
            } else { // 현재 연속 합이 N보다 작은 경우
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);


    }
}
