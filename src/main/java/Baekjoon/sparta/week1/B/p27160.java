package Baekjoon.sparta.week1.B;

import java.io.*;
import java.util.*;


/**
 ** 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 :
 *      - 카드의 개수 정보
 * * 2. 조건 :
 *      - 같은 과일이 5개 이상이면 "YES" 출력
 *      - 5개 미만이면 "NO" 출력
 * * 3. 전략 :
 *      - 모든 카드가 처리된 후, 5개 이상인 과일이 있으면 "YES", 없으면 "NO" 출력
 * * --------------------------------------------------------------------------------
 */
public class p27160 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCards = Integer.parseInt(br.readLine());

        HashMap<String, Integer> fruit = new HashMap<>();

        for (int i = 0; i < numCards; i++) {
            String[] split = br.readLine().split(" ");
            int Value = fruit.getOrDefault(split[0], 0);
            fruit.put(split[0], Value + Integer.parseInt(split[1]));
        }

        if (fruit.containsValue(5)) System.out.println("YES");
        else System.out.println("NO");
    }
}