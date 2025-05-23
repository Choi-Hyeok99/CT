import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println("0");
            return;
        }

        int dasom = Integer.parseInt(br.readLine());
        int count = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N - 1; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        while (!pq.isEmpty() && pq.peek() >= dasom) {
            int maxVote = pq.poll();
            maxVote--;
            dasom++;
            count++;
            pq.add(maxVote);
        }

        System.out.println(count);
    }
}
