package Baekjoon.sparta.S;


import java.io.*;
import java.util.*;

/**
 *
 * 문제 분석
 * --------------------------------------------------------------------------------
 * 1. 입력 :
 *      - N : 포켓몬의 개수 ( 등록 포켓몬 수 )
 *      - M : 질문의 수 ( 이름 or 번호 )
 * 2. 조건 :
 *      - 이름으로 질문하면 포켓몬 번호를 출력.
 *      - 번호로 질문하면 포켓몬 이름을 출력.
 *      - 번호는 1부터 시작하며, 입력된 이름의 순서대로 번호가 부여됨.
 *      - 이름은 대소문자를 구분함.
 * 3. 전략 :
 *      - HashMap을 이용한 매핑
 *      - 질문 처리
 *      - 시간 복잡도 최적화
 * --------------------------------------------------------------------------------

 */
public class p1620_S4 {
    public static void main(String[] args) throws IOException {
        // 입력 및 출력 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 두 개의 Map을 이용하여 포켓몬 번호와 이름 매핑
        Map<String, Integer> map_v1 = new HashMap<>(); // 이름 -> 숫자
        Map<Integer, String> map_v2 = new HashMap<>(); // 숫자 -> 이름

        // N개의 포켓몬 이름 받기
        for (int i=0; i<N; i++){
            String name = br.readLine(); // 포켓몬 이름
            map_v1.put(name, i + 1);     // 이름 -> 번호 저장
            map_v2.put(i + 1, name);     // 번호 -> 이름 저장
        }

        // M개의 질문
        for (int i=0; i<M; i++){
            String inputValue = br.readLine(); // 질문 ( 이름 or 번호 )


            if (Character.isDigit(inputValue.charAt(0))){
                bw.write(map_v2.get(Integer.parseInt(inputValue)) + "\n"); // 숫자일 경우 번호로 이름 검색
            } else bw.write(map_v1.get(inputValue) + "\n" ); // 문자일 경우 이름으로 번호 검색
        }
        bw.flush();
    }
}
