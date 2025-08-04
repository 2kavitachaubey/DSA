package leetCode;

public class BuyAndSale {
    public static void main(String[] args) {
        int[] arr = new int[]{6,6,4,4,1};
        int min = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i] - arr[j] < min){
                    min = arr[i] - arr[j];
                }
            }
        }
        if(min < 0){
            System.out.println(min * -1);
        }
        else {
            System.out.println(0);
        }
    }
}
