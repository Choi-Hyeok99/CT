
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력과 출력을 위한 BufferedReader와 BufferedWriter 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄 입력: n (노래 개수), m (음 개수)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 노래 개수
        int m = Integer.parseInt(st.nextToken()); // 음 개수

        // HashMap 초기화: Key는 음 코드, Value는 노래 제목 또는 '?'
        HashMap<String, String> map = new HashMap<>();

        // n개의 노래 데이터를 입력받아 HashMap에 저장
        while (n-- > 0) {
            String line = br.readLine();
            String[] arr = line.split(" ", 3); // 제목 길이, 제목, 음 코드 분리
            String code = arr[2].substring(0, 5); // 음 코드의 앞 5글자 추출

            // Key가 이미 존재하면 '?'로 갱신, 아니면 노래 제목 저장
            if (map.containsKey(code)) {
                map.put(code, "?\n");
            } else {
                map.put(code, arr[1] + "\n");
            }
        }

        // 결과를 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();

        // m개의 음 데이터를 처리
        while (m-- > 0) {
            String inputCode = br.readLine(); // 음 코드를 입력받음

            // HashMap에서 Key 검색
            if (map.containsKey(inputCode)) {
                sb.append(map.get(inputCode)); // Key가 존재하면 값 추가
            } else {
                sb.append("!\n"); // Key가 없으면 "!" 추가
            }
        }

        // 최종 결과를 출력
        bw.write(sb.toString());
        bw.flush();

        // 리소스 정리
        bw.close();
        br.close();
    }
}
