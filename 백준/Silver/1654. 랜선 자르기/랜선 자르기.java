import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int numOfLines = Integer.parseInt(st.nextToken()); // 현재 가진 랜선의 개수
        int requiredLines = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수
        
        int[] lineLengths = new int[numOfLines]; // 각 랜선의 길이 저장
        for (int i = 0; i < numOfLines; i++) {
            lineLengths[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(lineLengths); // 정렬 (오름차순)
        
        long maxLength = lineLengths[numOfLines - 1]; // 가장 긴 랜선의 길이
        long minLength = 1; // 최소 길이
        long midLength = 0; // 이분 탐색 중간값
        long count = 0; // 잘라낸 랜선의 개수
        
        while (minLength <= maxLength) {
            count = 0;
            midLength = (minLength + maxLength) / 2; // 중간값 계산
            
            for (int length : lineLengths) {
                count += length / midLength; // 잘라낸 랜선의 개수 계산
            }
            
            if (count < requiredLines) {
                maxLength = midLength - 1; // 랜선 길이를 줄인다
            } else {
                minLength = midLength + 1; // 더 긴 랜선 길이를 시도
            }
        }
        
        // 결과 출력: 가능한 최대 랜선 길이
        System.out.println(maxLength);
    }
}