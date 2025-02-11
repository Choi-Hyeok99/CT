class Solution {
    public int solution(int angle) {
        switch (angle) {
            case 90:
                return 2; // 직각 (90도)
            case 180:
                return 4; // 평각 (180도)
            default:
                return (angle < 90) ? 1 : 3; // 예각 (1) / 둔각 (3)
        }
    }
}