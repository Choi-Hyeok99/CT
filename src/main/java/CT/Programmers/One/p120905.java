package CT.Programmers.One;

import java.util.Arrays;
class p120905 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}