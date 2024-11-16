package Baekjoon.sparta.B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p25593 {
    public static void main(String[] args) throws IOException {


        // 근무 시간을 저장 Map
        HashMap<String, Integer> workMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int count = Integer.parseInt(br.readLine());

        // 각 일에 대해 근무 시간을 계산
        for (int i = 0; i < count; i++) {
            // 1주일 동안의 근무 시간 받기
            for (int j = 1; j <= 4; j++) {
                String[] week = br.readLine().split(" "); // 주간 근무 시간 배열로 split
                for (String day : week) {
                    if (!"-".equals(day)) { // 근무하지 않은 날은 제외
                        // 주차별 근무 시간 설정
                        int hours = 0;
                        if (j == 1) {
                            hours = 4;
                        } else if (j == 2) {
                            hours = 6;
                        } else if (j == 3) {
                            hours = 4;
                        } else if (j == 4) {
                            hours = 10;
                        }

                        // 요일별로 근무 시간을 추가
                        workMap.put(day, workMap.getOrDefault(day, 0) + hours);
                    }
                }
            }
        }

        // 근무 시간 최소,최대

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : workMap.entrySet()){
            int value = entry.getValue();
            max = Math.max(max,value);
            min = Math.min(min,value);
        }

        // 최소값과 최대값의 차이가 12시간 이하이면 "Yes", 아니면 "No" 출력
        System.out.println((max - min <= 12) ? "Yes" : "No");
    }
}
