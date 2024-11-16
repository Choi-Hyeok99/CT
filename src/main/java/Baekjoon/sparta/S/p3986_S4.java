package Baekjoon.sparta.S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 */
public class p3986_S4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < count; i++) {
            Stack<Character> st = new Stack<>();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {

                char val = s.charAt(j);
                if (st.isEmpty()) {
                    st.push(val);
                } else {
                    if (st.peek() == val) {
                        st.pop();
                    } else {
                        st.push(val);
                    }
                }
            }
            if (st.empty()) {
                result++;
            }
        }
        System.out.println(result);
    }
}