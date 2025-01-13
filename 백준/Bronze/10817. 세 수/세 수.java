/*
    # 정수 3개 (A , B , C)
    # 2번째로 큰 정수 
    # 공백이 있고 
    # 접근 전략 ( 배열에 넣고 정렬 후 인덱스 1번을 출력)
*/ 

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력 : input 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 배열 선언 및 입력 받기 
        int[] arr = new int[3];
        
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        
        // 배열 정렬 
        Arrays.sort(arr);
        
        
        // 출력 
        System.out.println(arr[1]);
    }
}