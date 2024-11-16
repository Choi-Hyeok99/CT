package Baekjoon.sparta.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 : BufferedReader로 학생 수 카드 번호 입력, 배열에 저장
 * * 2. 조건 :
 *      - ArrayList 활용하기
 *      - 카드 번호를 기반으로 줄의 특정 위치에 학생 번호 삽입
 * * 3. 전략 :
 *      - 학생 수 n, 카드 번호 배열에 저장
 *      - ArrayList<Integer 생성
 *      - 카드 번호를 순서대로 처리하여 학생 번호를 특정 위치에 삽입
 * * --------------------------------------------------------------------------------
 */
public class p2605 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 학생 수 입력
        int n = Integer.parseInt(br.readLine());

        // 2. 카드 번호 입력받기
        String[] input = br.readLine().split(" ");
        int[] cards = new int[n];
        for (int i=0; i<n; i++){
            cards[i] = Integer.parseInt(input[i]);
        }

        // 3.줄 세우기 ( List )
        List<Integer> line = new ArrayList<>();
        for (int i=0; i<n; i++){
            int card = cards[i];
            // 카드 번호에 따라 위치에 삽입
            line.add(line.size()-card , i + 1);
        }

        // 4 출력
        for (int student : line){
            System.out.print(student+ " ");
        }
    }
}
