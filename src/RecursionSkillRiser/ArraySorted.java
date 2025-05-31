package RecursionSkillRiser;

public class ArraySorted {
    static boolean arr(int[] num,int idx){
        if(idx == num.length-1){
            return true;
        }
        if(num[idx] > num[idx+1]){
            return false;
        }
        return arr(num,idx+1);
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        System.out.println(arr(num,0)?"Sorted":"Not Sorted");
    }
}
