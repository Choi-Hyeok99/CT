package algorithm;

public class BinarySearch{
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,13,15,19,21,23,25,27,29};
        int key = 51;
        int resultIndex = binarySearch(arr,key);

        if(resultIndex != -1){
            System.out.println("내가 찾는 번호 " + key +" 의 인덱스 값은?"+ resultIndex + " 입니다. ");
        } else {
            System.out.println("내가 찾는 번호 " + key +" 존재하지 않습니다.");
        }
    }

    public static int binarySearch(int[] arr ,int key){

        int low = 0;
        int high = arr.length -1;

        while (low<=high){
            int mid = (low + high) / 2;

            if(arr[mid] < key){
                low = mid + 1;
            } else if ( arr[mid] > key){
                high = mid - 1;
            } else {
                return mid;
            }
        }
            return  -1;
    }
}