package BigO;

import java.util.Arrays;

//O(N)
public class ReverseArray {
    void reverse(int [] array){
        for(int i = 0 ; i<array.length/2; i++){  //n/2
            int other = array.length-1-i;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        System.out.println(Arrays.toString(array));  // n
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        r.reverse(new int[]{1,2,3,4,5});
    }
}
