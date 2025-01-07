import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N개 수 선언 
        int N = Integer.parseInt(br.readLine());
        
        // 배열 선언 
        int[] arr = new int[N];
        
        // 배열 선언 
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        for(int j=0; j<N; j++){
            System.out.println(arr[j]);
        }
    }
}