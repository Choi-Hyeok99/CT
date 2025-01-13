/*
    # 수첩1 : 하루동안 본 정수 
    # 수첩2 : 연종이 대답한 내용 
    
    # 접근 전략 
    1. 수첩 1의 정수를 HashSet에 저장하여 탐색 속도를 O(1)로 만든다.
    2. 각 정수에 대해 HashSet에 contains 메서드로 포함 여부 확인 
*/

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        // 입력 받기 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 
        StringTokenizer st; 
        
        // 테스트 케이스 
        int T = Integer.parseInt(br.readLine());
        
        // 테스트 케이스 처리  
        while ( T --> 0){
            int N = Integer.parseInt(br.readLine()); // 수첩 1 크기 
            
            HashSet<Integer> note1 = new HashSet<>(); 
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                note1.add(Integer.parseInt(st.nextToken()));
            }
            
            int M = Integer.parseInt(br.readLine()); // 수첩 2 크기 
            st = new StringTokenizer(br.readLine()); 
            for(int i=0; i<M; i++){
                int note2 = Integer.parseInt(st.nextToken());
                if(note1.contains(note2)){
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }
        System.out.print(sb);
    }
}