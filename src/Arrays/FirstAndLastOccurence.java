package Arrays;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,5,5,5,5,5,7,13,24};
        int [] newArr = {-1,-1};
        System.out.println(Arrays.toString(newArr));
        int x = 5;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            if(arr[low]==x && newArr[0] == -1){
                newArr[0]=low;
            }else if(arr[high]==x && newArr[1]==-1){
                newArr[1]=high;
            }else{
                low++;
                high--;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
