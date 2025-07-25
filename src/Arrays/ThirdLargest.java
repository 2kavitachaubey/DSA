package Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,6,7,7,2};
        if(arr.length < 3){
            System.out.println(-1);
        }
        int min = -1;
        int max = -1;
        int mid = -1;
        for(int i : arr){
            if(i >= max){
                min = mid;
                mid = max;
                max = i;
            }else if(i>=mid){
                min = mid;
                mid = i;
            }else if(i>=min){
                min = i;
            }
        }
        System.out.println("Value of Max: " + max);
        System.out.println("Value of Mid: " + mid);
        System.out.println("Value of third largest:" + min);
    }
}
