import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스 
        int T = Integer.parseInt(br.readLine());
        
        while( T --> 0 ){
            String input = br.readLine(); // 문자열 입력 받기
            int[] arr = new int[26]; // 알파벳 저장 ( a - z )
            
            // 문자 개수 카운트 
            for(char c : input.toCharArray()){
                if(Character.isLetter(c)){
                    arr[c - 'a' ]++; // 'a' 기준으로 배열 인덱스 계산 
                }
            }
            // 최빈 문자 찾기
            int maxCount = 0; 
            char maxChar = '?';
            boolean multiple = false; 
            
            for(int i=0; i< 26; i++){
                if(arr[i] > maxCount){
                    maxCount = arr[i];
                    maxChar = (char) (i + 'a'); 
                    multiple = false; // 새로운 최대값으로 초기화 
                } else if ( arr[i] == maxCount){
                    multiple = true ; // 동일한 최빈값이 2개 이상이면 ? 출력 
                }
            }
            System.out.println(multiple ? "?" : maxChar);
        }        
    }
}