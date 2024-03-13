package Test;

import java.util.PriorityQueue;
import java.util.Scanner;


/* 1. 기본예제
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
 */


 // 2. 정렬 전략 설정 예제 1
 // 숫자 10개를 입력받아 오름차순으로 정렬하되, 홀수가 짝수보다 우선순위가 높다고 가정
/*
public class priorityQueue{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue pq = new PriorityQueue<>((o1, o2) -> {
          // 파라미터로 받은 o1,o2는 기본적으로 object형이며
          // string으로 변환 후 , int형으로 다시 변환
          int x = Integer.parseInt(o1.toString());
          int y = Integer.parseInt(o2.toString());

          // x,y가 들어왔을 때  , x에 높은 우선순위를 주고싶다면 음수값 return
            if(x % 2 == y % 2){
                return x-y;
            } else {
                if(x%2 == 1 && y % 2 ==0){
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        System.out.print("입력 : ");
        for(int i = 0 ; i<10; i++){
            pq.add(sc.nextInt());
        }
        System.out.print("출력 : ");
        for (int i = 0 ; i<10; i++){
            System.out.print(pq.poll()+ " ");

            // Ex ) 입력 : 1 2 3 4 5 6 7 8 9 10
            // Ex ) 출력 : 1 3 5 7 9 2 4 6 8 10
        }
    }
}
 */

// 3.정렬 전략 설정 예제 2
// Integer 타입만을 받는 Priority Queue가 아닌 (Integer, Integer) 타입으로 받고, 첫번째 인자를 기준으로 정렬하는 예제
public class priorityQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<MyFormat> pq = new PriorityQueue<>();
        System.out.println("입력 x y : ");
        for(int i = 0 ; i < 5 ; i ++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            pq.add(new MyFormat(x, y));
        }

        System.out.println("출력 x y : ");
        for(int i = 0 ; i < 5 ; i ++) {
            MyFormat mf = pq.poll();
            System.out.println(mf.x + " " + mf.y);
        }
    }
    static class MyFormat implements Comparable<MyFormat>{
        int x, y;

        public MyFormat(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // x를 기준으로 오름차순 정렬
        @Override
        public int compareTo(MyFormat o) {
            return this.x - o.x;

            /* EX )
            입력 x y :
            3 7
            4 1
            2 8
            8 6
            4 0
             */
            /*
            Ex )
            출력 x y :
            2 8
            3 7
            4 1
            4 0
            8 6

            */
        }
    }
}
