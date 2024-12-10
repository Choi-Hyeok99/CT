
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] numbers;
    static int[] count = new int[8001]; // 숫자 범위 (-4000 ~ 4000)

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N 입력 받기
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 입력받으며 계산
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
            sum += num;

            max = Math.max(max, num);
            min = Math.min(min, num);

            // count 배열 업데이트
            count[num + 4000]++;
        }

        // 산술평균
        sb.append(Math.round((double) sum / N)).append("\n");

        // 중앙값
        Arrays.sort(numbers);
        sb.append(numbers[N / 2]).append("\n");

        // 최빈값
        int mode = counting();
        sb.append(mode).append("\n");

        // 범위
        sb.append(max - min).append("\n");

        // 출력
        System.out.print(sb);
    }

    // 최빈값 계산
    static int counting() {
        int maxCount = 0;
        List<Integer> list = new ArrayList<>(); // 최빈값 저장 리스트

        // 빈도 최대값 찾기
        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
            }
        }

        // 최빈값 수집
        for (int i = 0; i < 8001; i++) {
            if (count[i] == maxCount) {
                list.add(i - 4000); // 인덱스를 실제 값으로 변환
            }
        }

        // 최빈값 중 2번째로 작은 값 반환
        if (list.size() > 1) {
            Collections.sort(list);
            return list.get(1);
        } else {
            return list.get(0);
        }
    }
}
