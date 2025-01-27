import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int i = 2;  
        
        if(N == 1){
            return;
        }
        
        while(true){
            
            while(N % i == 0){
                N/= i;
                System.out.println(i);
            }
            
            if ( N != 1){
                i++;
            } else {
                break;
            }
        }
    }
}