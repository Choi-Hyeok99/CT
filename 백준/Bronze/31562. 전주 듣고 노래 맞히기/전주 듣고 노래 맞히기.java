import java.io.*;
import java.util.*;

public class Main {
    /*
    문제 분석:
    1. 첫 3개의 음을 입력받아, 노래 리스트를 순회하여 맨 앞 3개의 음과 일치하는 노래를 찾는다.
    2. 조건에 따라 결과 출력:
       - 일치하는 노래가 1개면 노래 제목 출력.
       - 일치하는 노래가 여러 개면 ? 출력.
       - 일치하는 노래가 없으면 ! 출력.
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N: 음을 알고 있는 노래의 개수, M: 맞출 음의 개수
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]); // N: 노래의 개수
        int M = Integer.parseInt(NM[1]); // M: 맞춰야 할 음의 개수

        // 음악 정보를 저장하는 이차원 배열
        // 각 행은 [노래 제목, 첫 번째 음, 두 번째 음, ...] 형태로 저장
        String[][] musicInfo = new String[N][];
        for (int i = 0; i < N; i++) {
            musicInfo[i] = br.readLine().split(" "); // 한 줄씩 읽어서 배열로 저장
        }

        // M개의 음 정보를 처리
        for (int j = 0; j < M; j++) {
            // 입력받은 음 데이터를 공백 없이 합침
            String code = br.readLine().replaceAll(" ", ""); // 맞춰야 할 음 (3개 음의 코드)
            ArrayList<String> list = new ArrayList<>(); // 일치하는 노래 제목을 저장할 리스트

            // N개의 노래를 순회하며 맞춰야 할 음(code)과 비교
            for (int i = 0; i < N; i++) {
                // 노래의 첫 3개의 음을 공백 없이 합침
                if ((musicInfo[i][2] + musicInfo[i][3] + musicInfo[i][4]).equals(code)) {
                    list.add(musicInfo[i][1]); // 일치하는 노래의 제목을 리스트에 추가
                }
            }

            // 결과 처리
            int listSize = list.size();
            if (listSize == 1) { // 정확히 1개의 노래와 일치
                System.out.println(list.get(0)); // 노래 제목 출력
            } else if (listSize > 1) { // 여러 개의 노래와 일치
                System.out.println("?"); // 불확실한 경우
            } else { // 일치하는 노래가 없음
                System.out.println("!"); // 일치하지 않는 경우
            }
        }
    }
}
