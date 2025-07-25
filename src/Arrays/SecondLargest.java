package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int []arr = new int[]{1,4,2,5,8};
        int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int lessMax = 0;
        for(int i =0; i<arr.length; i++){
            if(lessMax < arr[i] && arr[i] < max){
                lessMax = arr[i];
            }
        }
        System.out.println(lessMax);
    }
}
