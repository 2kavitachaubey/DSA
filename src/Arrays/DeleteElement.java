package Arrays;

public class DeleteElement {
    public static char[] delete(char[] array, int pos){
        char[] newArr = new char[array.length-1];
        int j = 0;
        for(int i=0; i<array.length; i++){
            if(i==pos-1){
                newArr[j] = array[i+1];
                i++;
            }else{
                newArr[j] = array[i];
            }
            j++;
        }
        return newArr;
    }
    public static void main(String[] args){
        char[] arr = new char[]{'A','B','C','D','E'};
        arr = delete(arr,2);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
