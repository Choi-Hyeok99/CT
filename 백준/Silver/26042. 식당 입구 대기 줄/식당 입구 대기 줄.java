import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // Queue 구조로 줄 관리
        Queue<Integer> queue = new LinkedList<>();

        // 줄 최대 길이
        int max = 0;

        // 뒤에 대기 중 학생
        int nextStudent = -1;

        for(int i=0; i<n; i++){

            String[] line = br.readLine().split(" ");

            // 유형 1 학생 추가
            if(line[0].equals("1")){
                int student = Integer.parseInt(line[1]);
                queue.add(student);

              if(queue.size() > max){
                  max = queue.size();
                  nextStudent = student; // 뒤에 학생 기록
              } else if ( queue.size() == max ){
                  // 최대 길이가 같을 경우 , 더 작은 번호 기록
                  nextStudent = Math.min(nextStudent, student);
              }
            }
            // 유형 2 ( 학생 제거 )
            else if (line[0].equals("2")){
                if(!queue.isEmpty()){
                    queue.poll();
                }
            }
        }
        // 학생이 없는 경우
        if(max == 0){
            bw.write("0 -1\n");
        } else {
            bw.write(max + " " + nextStudent + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
