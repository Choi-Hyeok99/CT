import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 레슨의 개수, M: 블루레이 개수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] lessons = new int[N];
        st = new StringTokenizer(br.readLine());
        int maxLesson = 0; // 레슨 중 가장 긴 길이
        int sumLesson = 0; // 모든 레슨의 합

        for (int i = 0; i < N; i++) {
            lessons[i] = Integer.parseInt(st.nextToken());
            maxLesson = Math.max(maxLesson, lessons[i]); // 가장 긴 레슨을 찾음
            sumLesson += lessons[i];
        }

        // 이진 탐색 초기화
        int left = maxLesson; // 최소 블루레이 크기 (가장 긴 레슨 길이)
        int right = sumLesson; // 최대 블루레이 크기 (모든 레슨의 합)
        int result = right; // 결과값 (최소 블루레이 크기)

        while (left <= right) {
            int mid = (left + right) / 2; // 현재 블루레이 크기 시도

            if (canDivide(lessons, mid, M)) { // 블루레이 개수 M으로 나눌 수 있는지 확인
                result = mid; // 가능하면 결과를 갱신
                right = mid - 1; // 더 작은 크기를 시도
            } else {
                left = mid + 1; // 더 큰 크기를 시도
            }
        }

        System.out.println(result); // 최소 블루레이 크기 출력
    }

    // 블루레이 크기 maxSize로 M개 이하로 나눌 수 있는지 확인하는 함수
    private static boolean canDivide(int[] lessons, int maxSize, int M) {
        int count = 1; // 필요한 블루레이 개수 (최소 1개)
        int sum = 0; // 현재 블루레이의 합

        for (int lesson : lessons) {
            if (sum + lesson > maxSize) { // 현재 블루레이 크기를 초과하면
                count++; // 새로운 블루레이가 필요함
                sum = lesson; // 새로운 블루레이에 현재 레슨 저장

                if (count > M) { // 블루레이 개수가 M을 초과하면
                    return false; // 나눌 수 없음
                }
            } else {
                sum += lesson; // 현재 블루레이에 레슨 추가
            }
        }
        return true; // M개 이하로 나눌 수 있음
    }
}
