import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        
        // 점수 입력 
        for(int i=0; i< 5; i++){
            int score = Integer.parseInt(br.readLine()); // 각 점수 입력 
            if(score < 40){
                sum += 40; 
            } else {
                sum += score;
            }
        }
        
        // 평균 출력 (정수형 소수점 없이 출력)
        System.out.println(sum/5);
    }
}