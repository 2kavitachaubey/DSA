package leetCode;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int [] num = {9,9,9,8};
        for(int i = num.length -1; i>0; i--){
            if(num[i] < 9){
                num[i]++;
                System.out.println(Arrays.toString(num));
                return;
            }
            num[i] = 0;
        }
        int [] result = new int[num.length +1];
        result[0] = 1;
        System.out.println(Arrays.toString(result));
    }
}
