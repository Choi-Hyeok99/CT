import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력 
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        // 숫자의 개수 
        int N = Integer.parseInt(br.readLine()); 
        
       
        // 숫자 문자열 입력 받기 
        
        String num = br.readLine(); 
        
        int sum = 0;
        
        // 문자열을 한 글자씩 순회하며 숫자로 변환 후 합산 
        for(int i = 0; i<N; i++){
            sum += num.charAt(i) - '0'; // char -> int 로 변환 
        }
        System.out.println(sum);
    }
}