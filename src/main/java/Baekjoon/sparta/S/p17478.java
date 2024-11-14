package Baekjoon.sparta.S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 : 첫 번째 줄에 재귀의 깊이 N (0 ≤ N ≤ 1000)이 주어짐
 * * 2. 조건 :
 *      - 출력의 형식은 재귀가 깊어질수록 ____이 추가되며, 이를 통해 들여쓰기를 표현
 *      - N이 0일 때는 "재귀함수는 자기 자신을 호출하는 함수라네"라고 출력되고, 재귀가 끝난 후에는 "라고 답변하였지."가 출력됨
 * * 3. 전략 :
 *      - 주어진 N만큼 재귀를 진행하면서 각 호출마다 ____을 추가하여 들여쓰기 형식으로 출력
 *      - StringBuilder를 사용하여 출력 형식을 효율적으로 처리
 *      - BufferedReader를 사용하여 입력을 받아 처리
 *
 * * --------------------------------------------------------------------------------
 */
public class p17478 {
    static StringBuilder sb = new StringBuilder();
    static String underBar = "";
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());  // 입력 받기

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");

        recursion(0);
        System.out.println(sb);
    }

    static void recursion(int count) {
        String temp = underBar;
        if (count == N) {

            sb.append(temp).append("\"재귀함수가 뭔가요?\"\n");
            sb.append(temp).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            sb.append(temp).append("라고 답변하였지.\n");

            return;

        }

        sb.append(temp).append("\"재귀함수가 뭔가요?\"\n");
        sb.append(temp).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
        sb.append(temp).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
        sb.append(temp).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");

        underBar += "____";

        recursion(count + 1);
        sb.append(temp).append("라고 답변하였지.\n");
    }
}
