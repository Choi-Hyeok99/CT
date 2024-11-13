package Baekjoon.sparta.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. 문제
 * 고려대학교에 입학한 새내기 호돌이는 안암역을 지나다가 한 붕어빵 장수를 만났어요.
 *
 * “안녕, 안녕, 안녕하십니까, 아저씨! 붕어빵 두 개 주세요.”
 *
 * “안녕을 세 번 외쳤으니 붕어빵 세 개!”
 *
 * 붕어빵 두 개의 값을 내고 세 개를 받은 호돌이는 기분이 좋았어요. 호돌이가 붕어빵 하나를 꺼내어 한 입 물었는데…. 너무 뜨거워서 그만 붕어빵을 떨어뜨리고 말았어요ㅠㅠ
 * 붕어빵은 자유 낙하운동을 하면서 땅에 떨어졌는데 신기하게도 좌우가 뒤집힌 모양으로 착지했답니다. 호돌이가 붕어빵을 한 입 물기 전의 모양이 입력으로 주어지면,
 * 땅에 떨어졌을 때에는 어떤 모양일지 출력하세요.
 *
 * 2.입력
 * 첫째 줄에는 두 개의 정수 N과 M(0≤N,M≤10)이 주어집니다. 둘째 줄부터 N개의 줄에 걸쳐 붕어빵의 모양이 주어집니다.
 * 각 행에는 공백을 나타내는 ‘0‘ 또는 붕어빵을 나타내는 ‘1’이 총 M개 주어집니다.
 *
 * 3.출력
 * 입력으로 주어진 붕어빵이 좌우로 뒤집힌 모양을 출력하세요.
 *
 * * 문제 분석
 * * --------------------------------------------------------------------------------
 * * 1. 입력 : 첫 번째 줄에 두 개의 정수 N과 M이 주어집니다. (1 ≤ N ≤ 100, 1 ≤ M ≤ 100)
 * * 2. 조건 : 주어진 N개의 문자열을 각각 반전시켜서 출력해야 합니다.
 * * 3. 전략 :
 *      - N과 M을 입력받은 후, N개의 문자열을 배열에 저장합니다.
 *      - 각 문자열에 대해 StringBuilder를 사용하여 문자열을 뒤집고, 뒤집힌 문자열을 출력합니다.
 * * --------------------------------------------------------------------------------
 */
public class p11945 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N,M 입력
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        // 배열에 문자열 저장
        String[] strings = new String[N];

        // N개의 줄을 입력받아 배열의 저장
        for (int i=0; i<N; i++){
            strings[i] = br.readLine();
        }

        // 반전시킨 문자열 출력
        for(int i=0; i<N ; i++){
            StringBuilder sb = new StringBuilder(strings[i]);
            System.out.println(sb.reverse());
        }
    }
}
