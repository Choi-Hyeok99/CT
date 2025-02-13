class Solution {
    public int[] solution(int[] num_list) {
        int x = 0; // 짝
        int y = 0; // 홀
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0) x++;
            else y++;
        }
        return new int[]{x,y};
    }
}