package RecursionSkillRiser;

import java.util.Arrays;

public class IndexArray {
    static int[] newArray(int []arr,int index,int search,int count){
        if(index == arr.length){
            return new int[count];
        }
        if(arr[index]== search){
            count++;
        }
        int [] result = newArray(arr,index+1,search,count);
        if(arr[index] == search){
            result [count-1] = index;
        }
        return result;
    }
    static int[] array(int []num,int index,int value){
        return newArray(num,index,value,0);
    }
//    static void array(int []num,int[] list,int index,int idx,int value){
//        if(idx == num.length){
//            System.out.println(Arrays.toString(Arrays.copyOf(list,index)));
//            return ;
//        }
//        if(value == num[idx]){
//            list[index] = idx;
//            index++;
//        }
//        array(num,list,index,idx+1,value);
//    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,5,6,3,2,5};
        System.out.println(Arrays.toString(array(arr,0,5)));
    }
}
