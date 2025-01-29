import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long sum = 0L;
        int rt = 1;

        while (sum <= n){
            sum = sum + rt++;
        }

        System.out.println(rt-2);

    }
}