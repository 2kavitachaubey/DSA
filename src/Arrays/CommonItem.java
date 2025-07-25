package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class CommonItem {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 ={2,3,2,8,4};
        int count = (num1.length) + (num2.length);
        System.out.println(count);
        boolean flag = false;

        

        for(int i = 0; i<num1.length; i++){
            for(int j = 0 ; j<num2.length; j++){
                if(num2[i] == num1[j]){
                    flag = true;
                }
            }
        }
        System.out.println(count);
    }
}
