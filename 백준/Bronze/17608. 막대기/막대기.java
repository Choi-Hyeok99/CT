/**
 * # 문제 분석
 * --------------------------------------------------------------------------------
 * 1. 입력 :
 *    - N (1 ≤ N ≤ 100,000): 막대기의 개수
 *    - 각 막대기의 높이 h (1 ≤ h ≤ 1,000,000,000)
 * --------------------------------------------------------------------------------
 * 2. 조건 :
 *    - 막대기는 오른쪽 끝에서 왼쪽으로만 볼 수 있음.
 *    - 이전에 보인 막대기보다 높이가 높은 경우에만 보임.
 *    - 보이는 막대기의 개수를 계산.
 * --------------------------------------------------------------------------------
 * 3. 전략 :
 *    - 입력 데이터를 스택에 저장하며 처리.
 *    - 스택에서 데이터를 하나씩 꺼내며 최고 높이(maxHeight)를 갱신.
 *    - 현재 높이가 최고 높이보다 크면 보이는 막대기로 판단하여 count 증가.
 * --------------------------------------------------------------------------------
 */




import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int maxHeight = 0;

        // 1.스택에 모두 저장
        for(int i=0; i<N; i++){
            stack.push(Integer.parseInt(br.readLine()));
        }

        // 2. 스택에서 값을 꺼내며 비교
        while (!stack.isEmpty()){
            int current = stack.pop(); // 마지막 값 꺼내기

            if(current > maxHeight){
                count++;
                maxHeight = current; //
            }

        }
        System.out.println(count);
    }
}
