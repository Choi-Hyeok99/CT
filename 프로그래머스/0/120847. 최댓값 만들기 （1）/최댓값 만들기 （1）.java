import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순 정렬
        int n = numbers.length;
        return numbers[n - 1] * numbers[n - 2]; // 가장 큰 두 수의 곱 
    }
}