package Baekjoon.sparta.week2.S;

/**
 *  덱을 구현 ( Deque
 *  명령 8가지
 *  push_front X: 정수 X를 덱의 앞에 넣는다.
 *  push_back X: 정수 X를 덱의 뒤에 넣는다.
 *  pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *  pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *  size: 덱에 들어있는 정수의 개수를 출력한다.
 *  empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
 *  front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *  back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 **/

import java.io.*;
import java.util.*;

public class p10866_S4 {
    public static void main(String[] args) throws IOException {

        // 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        while(N --> 0 ){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            switch(st.nextToken()){
                case "push_front" :
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    if(deque.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deque.pollFirst()+ "\n");
                    break;
                case "pop_back" :
                    if(deque.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deque.pollLast()+ "\n");
                    break;
                case "size" :
                    bw.write(deque.size()+ "\n");
                    break;
                case "empty" :
                    if(deque.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "front" :
                    if(deque.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deque.peek()+ "\n");
                    break;
                case "back" :
                    if(deque.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deque.peekLast()+ "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
