class Solution {
    public int[] solution(int money) {
        
        int count = 0; // 잔 수 
        while( money >= 5500 ){
            money -= 5500;
            count++;
        } 
        return new int[]{count, money};
    }
}