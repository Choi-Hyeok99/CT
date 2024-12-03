
import java.io.*;
import java.util.*;

/**
 *
 * # 문제 요약
 *      1. N개의 건물이 수평선에 위치하며, 각 건물의 시각좌표와 높이가 주어짐
 *      2. 스카이라인이란 건물들의 높이가 변하는 지점
 *      3. 주어진 건물 정보로 변화를 추천해 스카이라인의 개수를 구하는 문제
 *
 *
 * # 접근
 *      1. 주어진 데이터는 건물의 시작 좌표가 정해진 부분 정렬은 필요 없을듯
 *      2. 스카이라인은 높이 변화가 발생할ㄷ 떄 증가 ( Stack 고려 )
 *
 *
 * # 과정
 *      1. 스카이 라인의 개수를 나타낼 변수 Count 초기화
 *      2. 현재 높이 관리 Stack
 *
 * # 높이 변화
 *      1. 높이 증가 : count++;
 *      2. 높이 감소 : stack에서 이전 높이 제거 , 기존 높이와 같아질 떄 까지 반복
 *      3. 높이가 같음 : 아무 작엄 X
 *
 * # 결과
 *      1. count 출력
 * 
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        // 건물 개수 입력
        int n = Integer.parseInt(br.readLine());

        // 스카이라인 개수 count와 스카이라인의 높이를 관리 할 스택
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken()); // x좌표
            int y = Integer.parseInt(st.nextToken()); // y좌표

            // 건물이 낮아지는 경우 : 현재 높이보다 큰 높이를 제거한다. 그래도 카운트는 증가한다.
            while(!stack.isEmpty() && stack.peek() > y ){
                stack.pop();
                count++;
            }

            // 건물이 같은 경우 : 스킵
            if(!stack.isEmpty() && stack.peek() == y) {
                continue;
            }

            // 건물이 높아지는 경우 스택 추가
            stack.push(y);
        }

        // Stack이 비지 않은 경우
        while(!stack.isEmpty()){
            if(stack.peek() > 0){
                count++;
            }
            stack.pop();
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
