import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] arr = new char[5][15]; // 다섯 줄, 최대 길이 15 
        int maxLength = 0; // 가장 긴 문자열의 길이를 저장 
        
        // 입력받기 
        for(int i=0; i<5; i++){
            String line = br.readLine(); 
            maxLength = Math.max(maxLength, line.length()); // 가장 긴 문자열 길이 저장 
            
            // 문자 저장 ( 남는 부분은 기본값 '/0' 유지 )
            for(int j=0; j< line.length(); j++){
                arr[i][j] = line.charAt(j); 
            }
        }
        
        // 세로 방향으로 출력 
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j<maxLength; j++){ // 가장 긴 문자열 길이까지 탐색 
            for(int i = 0 ; i<5; i++){ // 5줄 순회 
                if(arr[i][j] != '\0'){ // '\0'이 아닌 문자만 출력 
                    sb.append(arr[i][j]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}