class Solution {
    public int solution(int hp) {
        int 장군개미  = hp / 5; 
        int 병정개미 = (hp%5) / 3;
        int 일개미 =  ( hp % 5 ) % 3; 
        return 장군개미 + 병정개미 + 일개미;
    }
}