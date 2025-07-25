package Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,7,9,4};
        if(arr.length < 3){
            System.out.println(-1);
        }
        int min = -1;
        int max = -1;
        int mid = -1;
        for(int i : arr){
            if(i > max){
                min = mid;
                mid = max;
                max = i;
            }else if(i>mid && i != max){
                min = mid;
                mid = i;
            }else if(i>min && i != max && i != mid){
                min = i;
            }
        }
        System.out.println("Value of third largest:" + min);
    }
}
