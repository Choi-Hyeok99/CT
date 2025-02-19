class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) { // 1부터 n까지 모든 숫자 확인
            int count = 0; //  약수 개수를 저장할 변수

            for (int j = 1; j <= i; j++) { //  i의 약수를 찾음
                if (i % j == 0) { //  i를 j로 나눠서 약수인지 확인
                    count++;
                }
            }

            if (count >= 3) { //  약수가 3개 이상이면 합성수
                answer++; //  합성수 개수 증가
            }
        }

        return answer;
    }
}