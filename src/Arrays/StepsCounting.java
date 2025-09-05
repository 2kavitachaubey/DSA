package Arrays;

import java.util.Arrays;

public class StepsCounting {
    public static void main(String[] args) {
        int[] arr = {5,2,5,4,5};
        int target = 2;
        Arrays.sort(arr);
        if(arr[0]<target){
            System.out.println(-1);
        }
        int prev = -1;
        int count = 0;
        for(int num: arr){
            if(num > target && num != prev){
                count++;
            }
            prev = num;
        }
        System.out.println(count);
    }
}
