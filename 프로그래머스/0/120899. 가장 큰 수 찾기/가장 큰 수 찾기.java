class Solution {
    public int[] solution(int[] array) {
        
        int max = array[0]; // 최대값 초기화 
        int index = 0;
        
        for(int i=1; i<array.length; i++){
            if(array[i] > max) {
                max = array[i]; // 최대값 갱신
                index = i;
            }
        }
        
        return new int[]{max,index}; // 최대값과 인덱스를 배열로 반환 
    }
}