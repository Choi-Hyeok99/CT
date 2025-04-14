import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 큐 생성 
        Queue<Integer> queue = new ArrayDeque<>();
        
        // 큐 배치. 
        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        
        while(queue.size() > 1){
            queue.poll(); // 맨 앞 카드 버리고 
            queue.add(queue.poll()); // 두번째 카드 뒤로 이동 ( 맨 뒤 )
        }
        System.out.println(queue.peek()); // 카드 출력 

    }
}