
import java.io.*;
import java.util.*;

/**
 *
 *
 * 1. 배열에 자연수 x 를 넣는다.
 * 2. 배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
 * 3. 처음은 비어있는 배열에서 시작한다.
 *
 * 입 :
 * - 첫쨰 줄에 연산의 개수 N
 * - 다음 N개의 줄에는 연산에 대한 정보를 나타내는 x ( 정수 ) 가 주어진다 .
 * - x가 자연수라면 배열에 X라는 값을 넣는(추가하는) 연산이고, x == 0 이면 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우다.
 * - x는 2*^31 보다 작은 자연수 or 0 이고 , 음의 정수는 입력으로 주어지지 않는다.
 *
 *
 * # 예제 입력 1
 * 9
 * 0
 * 12345678
 * 1
 * 2
 * 0
 * 0
 * 0
 * 0
 * 32
 *
 * # 예제 출력 1
 *
 * 0
 * 1
 * 2
 * 12345678
 * 0
 *
 * - 내 생각에는 일단 아무것도 없는 빈값의 배열에는 -> 0이 출력됨 ( 0이면 일단 배열이 비었는지 확인 비어진 배열이면 0 출력 )
 *
 * # 전략
 *
 * - 우선순위 큐 ( 동작과 굉장히 비슷 )
 * - 한번 해보자
 */


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 연산횟수 N
        int N = Integer.parseInt(br.readLine());


        // 우선 순위 큐 선언 ( 기본이 오름차순 -> 가장 위에 있는 값이 작은 값 )
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0; i<N; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0){ // 입력 값이 0인 경우
                if(pq.isEmpty()) {
                    System.out.println(0); // 큐가 비어있으면 0 출력
                } else {
                    System.out.println(pq.poll()); // 가장 작은 값 출력하고 제거
                }
            } else {
                pq.add(x);
            }
        }
    }
}
