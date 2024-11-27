package Baekjoon.sparta.week1.S;

import java.io.*;
import java.util.*;

/**
 *
 * 문제 분석
 * --------------------------------------------------------------------------------
 * 1. 입력 :
 *    - 첫 번째 줄에 파일의 개수 N이 주어진다. (1 ≤ N ≤ 100,000)
 *    - 이후 N개의 줄에 걸쳐 파일명이 주어진다. 각 파일명은 확장자가 반드시 존재하며, 확장자는 점(.)으로 구분
 *
 * 2. 조건 :
 *    - 각 파일명은 공백 없이 주어지고, 확장자는 영문자로만 이루어져 있다
 *    - 출력은 알파벳 순으로 정렬된 확장자와 그 확장자가 포함된 파일의 개수를 출력
 *
 * 3. 전략 :
 *    - 먼저, 입력 받은 파일명에서 확장자를 추출
 *    - 추출한 확장자를 `Map`에 저장하고, 그 확장자의 개수를 카운트
 *    - `Map`의 키(확장자)를 알파벳 순으로 정렬한 후, 각 확장자와 그 개수를 출력
 * --------------------------------------------------------------------------------
 */
public class p20291 {
    public static void main(String[] args) throws IOException {

        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 파일의 개수 입력
        int N = Integer.parseInt(br.readLine());

        // 확장자별로 개수를 세기 위한 Map 사용
        Map<String, Integer> map = new HashMap<>();

        // N개의 파일명 입력 받기
        for (int i = 0; i < N; i++) {
            // 파일명을 '.'으로 분리해서 확장자만 추출
            String ext = br.readLine().split("\\.")[1];

            // 확장자가 이미 map에 있으면 개수 증가, 없으면 새로 추가
            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }

        // Map의 키(확장자)를 알파벳 순으로 정렬
        List<String> extensions = new ArrayList<>(map.keySet());
        Collections.sort(extensions);

        // 정렬된 확장자와 개수를 출력
        for (String ext : extensions) {
            System.out.println(ext + " " + map.get(ext));
        }
    }
}
