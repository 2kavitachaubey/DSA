package Arrays;

import java.util.Arrays;

public class InsertingDeleting {
    public static char[] insert(char[] array, int pos, char val){
        char[] newArr = new char[array.length+1];
        for(int i = 0; i<pos-1;i++){
            newArr[i] = array[i];
        }
        newArr[pos-1] = val;
        for(int i = pos; i<=array.length; i++){
            newArr[i] = array[i-1];
        }
        return newArr;
    }
    public static void main(String[] args){
        char[] arr = new char[]{'A','B','C','D','E'};
        arr = insert(arr,3,'P');
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
