package Arrays;

import java.util.*;
public class Array1Java {
    public static void main(String [] args){
        int[] arr ;            //O(1)
        arr = new int[5];      //O(1)
        arr[0]=1;   //O(1) --
        arr[1]=2;   //O(1) --
        arr[2]=3;   //O(1) --  -- //O(N)
        arr[3]=7;   //O(1) --
        arr[4]=5;   //O(1) --
        System.out.println(Arrays.toString(arr));

        String sarr[]= {"a","b","d"};   //O(1)
        System.out.println(Arrays.toString(sarr));

    }
}
