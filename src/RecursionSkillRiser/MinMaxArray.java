package RecursionSkillRiser;

import java.util.Arrays;

public class MinMaxArray {
    static int [] minMax(int []arr,int index){
        if(index==arr.length-1){
            int [] r = new int[2];
            r[0]=arr[index];
            r[1] = arr[index];
            return r;
        }

        int [] newArr = minMax(arr,index+1);
        if(newArr[0]>arr[index]){
            newArr[0] = arr[index];
        }
        else if(newArr[1]<arr[index]){
            newArr[1] = arr[index];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {2,1,5,1,3,4,8,5};
        System.out.println(Arrays.toString(minMax(arr,0)));
    }
}

