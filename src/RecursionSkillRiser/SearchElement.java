package RecursionSkillRiser;

public class SearchElement {
    static  boolean findNum(int [] arr, int idx, int num){
        if(num == arr[idx]){
            return true;
        }
        if(idx == arr.length-1){
            return false;
        }
        return findNum(arr,idx+1,num);
    }
    public static void main(String[] args) {
        int [] array = {2,3,5,7,9,6};
        System.out.println(findNum(array,0,8)?"found the number":"Can't found the number");
    }
}
