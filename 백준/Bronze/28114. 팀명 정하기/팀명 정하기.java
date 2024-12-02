
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Map<Integer, String> map = new HashMap<>();

        int[] year = new int[3];
        int[] solve = new int[3];

        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int s = Integer.parseInt(st.nextToken()); // 문제 수
            int y = Integer.parseInt(st.nextToken()) % 100 ; // 입학년도 마지막 두 자리
            String name = st.nextToken(); // 이름
            year[i] = y;
            solve[i] = s;
            map.put(s,  name);
        }

        // 정렬
        Arrays.sort(solve); // 문제 수 오름차순 정렬
        Arrays.sort(year); // 입학년도 오름차순 정렬

        // 첫 번쨰 출력  : 입학년도 정렬된 결과 이어 붙이기
        for(int i=0; i<3; i++){
            bw.write(String.valueOf(year[i]));
        }
        bw.newLine();

        // 두 번째 출력 : 문제 수 기준 내림차순으로 이름 이니셜 출력
        for(int i= 2; i>= 0; i--){
            bw.write(map.get(solve[i]).charAt(0));
        }
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
