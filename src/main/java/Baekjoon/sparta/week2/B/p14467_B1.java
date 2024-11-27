package Baekjoon.sparta.week2.B;

import java.io.*;
import java.util.*;

public class p14467_B1 {
    public static void main(String[] args) throws IOException {

     BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
     Map<Integer, Integer> map = new HashMap<>();
     int N = Integer.parseInt(br.readLine()); // 관찰 횟수

     int count = 0;

     for(int i= 0; i<N; i++){
         StringTokenizer st = new StringTokenizer(br.readLine());
         int cowNumber = Integer.parseInt(st.nextToken());
         int position = Integer.parseInt(st.nextToken());

         // 소의 이전 위치 비교
         if(map.containsKey(cowNumber)){
             if(map.get(cowNumber) != position){
                 count ++;
             }
         }
         // 소의 위치 업데이트
         map.put(cowNumber,position);
     }
        System.out.println(count);
    }
}
