package Test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class priorityQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.print("입력 : ");
        for(int i = 0 ; i<10; i++){
            pq.add(sc.nextInt());
        }
        System.out.print("출력 : ");
        for(int i = 0 ; i<10; i++){
            System.out.println(pq.poll());
        }

    }
}
