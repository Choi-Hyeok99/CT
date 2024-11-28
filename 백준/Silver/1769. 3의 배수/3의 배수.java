import java.io.*;

/**
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String X = br.readLine();

        // 변환 횟수
        int count = 0;

        while(X.length() > 1){
            int sum = 0;

            // 자릿수의 합 계산
            for(int i=0; i<X.length(); i++){
                sum += X.charAt(i) - '0' ;// 문자 -> 숫자 변환 후 합산
            }

            // 자릿수 합을 문자열로 변환
            X = Integer.toString(sum);
            // 변환 횟수 증가
            count++;
        }
        // 최종 숫자가 3의 배수인지 확인
        int finalNumber = Integer.parseInt(X); // 최종 X
        if(finalNumber % 3 == 0){
            System.out.println(count);
            System.out.println("YES");
        } else {
            System.out.println(count);
            System.out.println("NO");
        }
    }
}
