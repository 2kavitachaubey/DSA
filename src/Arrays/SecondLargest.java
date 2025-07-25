package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int []arr = new int[]{1,4,2,5,8,7};
        int max = Integer.MIN_VALUE;
        int lessMax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] > max) {
                lessMax = max;
                max = arr[i];
                System.out.println("this is max: " + max);
            }
            else if (arr[i] > lessMax && arr[i] != max) {
                lessMax = arr[i];
                System.out.println("this is lessmax: "+ lessMax);
            }
        }
        System.out.println(lessMax);
    }
}
