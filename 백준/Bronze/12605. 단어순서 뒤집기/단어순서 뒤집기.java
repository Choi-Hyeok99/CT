
import java.io.*;
import java.util.*;

/**
 * 문제 분석
 * --------------------------------------------------------------------------------
 * 1. 입력:
 *    - 첫 번째 줄에 테스트 케이스의 개수 N (1 ≤ N ≤ 100).
 *    - 다음 N개의 줄에 공백으로 구분된 단어들이 주어짐.
 *    - 각 줄은 공백으로 시작하거나 끝나지 않음.
 *
 * 2. 조건:
 *    - 각 테스트 케이스마다 단어의 순서를 뒤집어서 출력해야 함.
 *    - 단어의 순서만 바뀌고, 단어 자체는 그대로 유지.
 *    - 출력 형식은 "Case #i: "로 시작하며 i는 테스트 케이스 번호.
 *
 * 3. 출력:
 *    - 각 테스트 케이스의 결과를 한 줄씩 출력.
 * --------------------------------------------------------------------------------
 *
 * 전략
 * --------------------------------------------------------------------------------
 * 1. 입력 처리:
 *    - 첫 번째 줄에서 N을 읽고, 이후 N개의 줄을 처리.
 *
 * 2. 단어 순서 뒤집기:
 *    - 각 줄의 단어를 공백으로 분리하고, 스택에 저장한 뒤 꺼내면서 순서를 뒤집음.
 *
 * 3. 출력:
 *    - "Case #i: " 형식에 맞춰 결과 출력.
 * --------------------------------------------------------------------------------
 *
 * 예상 알고리즘
 * --------------------------------------------------------------------------------
 * 1. 스택 활용:
 *    - 각 줄의 단어를 스택에 저장 (LIFO 구조로 역순 처리).
 *
 * 2. 출력 조합:
 *    - 스택에서 단어를 꺼내면서 공백으로 연결해 출력.
 * --------------------------------------------------------------------------------
 */


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());


        for(int i=1; i<=N; i++){
            String input = br.readLine();
            String[] words = input.split(" "); // 단어 분리

            Stack<String> stack = new Stack<>();
            for(String word : words){
                stack.push(word); // 단어를 스택에 저장
            }

            // 현재 스택에 케이스 결과 생성
            sb.append("Case #").append(i).append(": ");

            while(!stack.isEmpty()){
                sb.append(stack.pop());
                if(!stack.isEmpty()){
                    sb.append(" ");
                }
            }
            sb.append("\n");

        }
        System.out.print(sb.toString());
    }
}
