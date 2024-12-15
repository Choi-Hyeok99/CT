import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (checkStr(br.readLine())) { // 조건에 맞는 문자열 체크
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }

    static boolean checkStr(String str) {
        boolean[] seen = new boolean[26]; // 알파벳 여부 체크
        char prev = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != prev) { // 새로운 문자 등장 시
                if (seen[current - 'a']) { // 이미 나온 문자라면 그룹 단어 아님
                    return false;
                }
                seen[current - 'a'] = true; // 현재 문자 방문 표시
            }
            prev = current; // 이전 문자 업데이트
        }
        return true; // 그룹 단어라면 true 반환
    }
}
