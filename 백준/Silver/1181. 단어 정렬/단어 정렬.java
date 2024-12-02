import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
        // 1. 길이가 짧은 것부터
        // 2. 길이가 같으면 사전 순으로
        // 중복된 단어는 하나만 남기고 제거한다.

        //입력
        // 1-> N이 주어진다. 2-> N줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한줄에 하나씩 주어진다.
        // 문자열은 50을 넘지 않음
        int T = Integer.parseInt(br.readLine());
        String[] text = new String[T];
        Set<String> set = new HashSet<>(); // 중복제거 ( HashSet -> 중복제거 O , 순서가 보장 X ) ,TreeSet( 정렬 ) 
        //[but, no, wait, im, more, i, wont, cannot, hesitate, it, yours]
        for (int i = 0; i < T; i++) {
            set.add(br.readLine());
        }


        String[] text2 = set.toArray(new String[0]);

        //[but, no, wait, im, more, i, wont, cannot, hesitate, it, yours]

        Arrays.sort(text2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같으면 알파벳 순
                }
                return o1.length() - o2.length(); // 길이 순 정렬
            }
        });
        StringBuilder sb = new StringBuilder();

        for (String s : text2) {
            sb.append(s + "\n");
        }


        // [i, im, it, no, but, more, wait, wont, yours, cannot, hesitate]
        bw.write(sb + "");
        //i
        //im
        //it
        //no
        //but
        //more
        //wait
        //wont
        //yours
        //cannot
        //hesitate

//        bw.write(list+ " ");
        // 26704/ 324
        br.close();
        bw.flush();
        bw.close();
    }
}
