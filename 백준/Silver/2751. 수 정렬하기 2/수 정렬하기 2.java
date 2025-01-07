import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 N개 받기 
        int N = Integer.parseInt(br.readLine());
        
        //기본형이 아닌 List사용해야  Collections.sort()를 쓰기 위해 Arrays.sort보다 빠름
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(list); // 리스트 정렬 
        
        for(int i=0; i<N; i++){
            bw.write(list.get(i) + " "); // list.get(i)
        }
        bw.flush();
        bw.close();
        br.close();
    }
}