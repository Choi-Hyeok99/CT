import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // A , 연산자 , B
        BigInteger A = new BigInteger(br.readLine());
        String ca = br.readLine();
        BigInteger B = new BigInteger(br.readLine());
        
        // 결과 
        BigInteger result = BigInteger.ZERO;
        
        // 스위치문으로 접근해서 진행
        switch (ca) {
            case "+":
                result = A.add(B);
                break;
            case "*":
                result = A.multiply(B);
                break;
        }
        System.out.println(result);
    }
}