import java.io.*;
import java.util.*;

public class Main{
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int size = Math.min(N,M);	//정사각형 최대의 경우 구하기
        boolean check = false;
        arr = new int[N][M];
        //입력되는 직사각형 값 저장
        for(int i=0;i<N;i++){
            String info = br.readLine();
            for(int j=0;j<M;j++)
                arr[i][j] = Character.getNumericValue(info.charAt(j));
        }
        //정사각형 큰 경우부터 탐색 시작
        while(size != 1){
            //기준 꼭짓점들에서 탐색
            for(int i=0;i<=N-size;i++){
                for(int j=0;j<=M-size;j++)
                    if(search(i, j, size-1)){
                        check = true;	//조건 만족하는 정사각형 찾았을 때
                        break;
                    }
                if(check)	//정사각형 찾았으므로 탐색 종료
                    break;
            }
            if(check)	//정사각형 찾았으므로 탐색 종료
                break;
            size--;	//정사각형 크기 줄이기
        }
        int answer = size * size;	//넓이 구하기
        bw.write(answer + "");	//넓이 BufferedWriter 저장
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
    //정사각형 꼭짓점이 모두 같은값인지 확인하는 함수
    static boolean search(int y, int x, int size){
        if(arr[y][x] == arr[y + size][x] && arr[y][x] == arr[y][x+size] &&
                arr[y][x] == arr[y+size][x+size])
            return true;
        return false;
    }
}