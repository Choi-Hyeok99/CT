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


