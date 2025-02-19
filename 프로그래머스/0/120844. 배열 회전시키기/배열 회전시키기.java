class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int n = numbers.length;
        int[] result = new int[n]; // 새로운 배열 생성 
        
        for(int i=0; i<n; i++){
            if(direction.equals("right")){
                result[(i + 1) % n] = numbers[i]; // 오른쪽으로 이동 
            } else if (direction.equals("left")){
                result[i] = numbers[(i+1) % n]; // 왼쪽이동 
            }
        }
        
        return result;
    }
}