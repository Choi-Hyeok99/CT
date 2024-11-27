package Baekjoon.sparta.week1.S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 1.인서와 준석 그리고 정우, 진우 마지막으로 영기는 대회를 준비하느라 정신이 없다. 그러던 어느 날 급하게 처리해야 할 일이 생기고 말았다. 피자를 숟가락으로 떠먹는 등의 일로 바빴던 5명은 서로에게 일을 떠넘기기에 급급했다.
 * 그러던 어느 날 더 이상 일을 미룰 수 없다고 판단한 다섯은 일처리를 누가 맡을지 이야기하여, 아래와 같은 자신들의 계산법을 바탕으로 최종 일량을 계산해 가장 일이 바쁘지 않은 사람에게 일처리를 맡기기로 하였다.
 *
 * 5개의 일이 존재한다.
 * 인서는 1번, 준석이는 2번, 정우는 3번, 진우는 4번, 영기는 5번으로 각자에게 번호를 부여한다.
 * 행렬 A는 인서, 준석, 정우, 진우, 영기가 예상하는 각 일의 난이도를 각 행에 일의 순서대로 나열한 5×5의 행렬이다. 즉, x행 y열의 값은 x번 사람이 예상한 y번째 일의 난이도이다.
 * 예를 들어 2행 1열의 값은 2번인 준석이가 예상한 1번째 일의 난이도, 5행 2열의 값은 5번인 영기가 예상한 2번째 일의 난이도이다.
 * 행렬 B는 인서, 준석, 정우, 진우, 영기가 예상한 각 일의 처리시간을 각 행에 일의 순서대로 나열한 5×5의 행렬이다. 즉, x행 y열의 값은 x번 사람이 예상한 y번째 일의 처리시간이다.
 * 예를 들어 2행 1열의 값은 2번인 준석이가 예상한 1번째 일의 처리시간, 5행 2열의 값은 5번인 영기가 예상한 2번째 일의 처리시간이다.
 * x번 사람의 y번째 일의 예상 일량은 아래와 같다.
 *
 *
 * 각자의 최종 일량은 1번째 일부터 5번째 일까지 그 사람의 예상 일량을 모두 합한 값이다.
 * 최종 일량이 가장 작은 사람이 가장 일이 바쁘지 않은 사람이다.
 * 이 계산법으로 작동하는 프로그램을 구현하여 가장 일이 바쁘지 않은 사람을 구하여라.
 *
 * 2. 입력
 * 5×5 행렬 A의 값 a1 ~ a25가 5줄에 걸쳐 순서대로 주어지며, 이후 5×5 행렬 B의 값 b1 ~ b25가 5줄에 걸쳐 순서대로 주어진다.
 * 단, ai는 1보다 크거나 같고 1000보다 작거나 같은 정수이며, bi는 1보다 크거나 같고 100보다 작거나 같은 정수이다.
 *
 * 3.출력
 * 가장 일이 바쁘지 않은 사람의 이름(Inseo, Junsuk, Jungwoo, Jinwoo, Youngki)을 출력한다. 만약,
 * 가장 일이 바쁘지 않은 사람이 둘 이상일 경우 Youngki, Jinwoo, Jungwoo, Junsuk, Inseo 순서로 가장 앞서는 사람의 이름을 출력한다.
 */

public class p17207 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 난이도 행렬 A (5x5)
        int[][] A = new int[5][5];
        // 처리시간 행렬 B (5x5)
        int[][] B = new int[5][5];

        // 첫 번째 행렬 A 입력 (난이도)
        for (int i = 0; i < 5; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                A[i][j] = Integer.parseInt(input[j]);
            }
        }

        // 두 번째 행렬 B 입력 (처리시간)
        for (int i = 0; i < 5; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                B[i][j] = Integer.parseInt(input[j]);
            }
        }

        // 각 사람의 예상 일량 계산
        int[] totalWork = new int[5];  // 5명에 대한 일량 계산 배열

        // 각 사람 i에 대해 (0부터 시작)
        for (int i = 0; i < 5; i++) {
            int total = 0;
            // 각 일 j에 대해
            for (int j = 0; j < 5; j++) {
                // i번 사람이 예상한 각 일에 대한 일량 계산
                for (int k = 0; k < 5; k++) {
                    total += (A[i][k]) * (B[k][j]);  // A[i][k] : 난이도, B[k][j] : 처리시간
                }
            }
            totalWork[i] = total;  // 최종 일량 저장
        }

        // 최소 일량을 가진 사람 찾기
        int minWork = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < 5; i++) {
            if (totalWork[i] < minWork) {
                minWork = totalWork[i];
                minIndex = i;
            }
        }

        // 이름 배열
        String[] names = {"Inseo", "Junsuk", "Jungwoo", "Jinwoo", "Youngki"};

        // 가장 일이 바쁘지 않은 사람 출력
        System.out.println(names[minIndex]);
    }
}
