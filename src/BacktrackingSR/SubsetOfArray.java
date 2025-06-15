package BacktrackingSR;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {
    public static List<List<Integer>> subset(int[]num){
        List<List<Integer>> list = new ArrayList<>();
        array(num,0, new ArrayList<Integer>(), list);
        return list;
    }
    public static void array(int[] num,int start, List<Integer> smallArray, List<List<Integer>> finalArray){
        finalArray.add(new ArrayList<>(smallArray));
        for(int i = start; i<num.length;i++){
            System.out.println(smallArray+ "  kdsgja");
            smallArray.add(num[i]);
            array(num,i+1,smallArray,finalArray);
            smallArray.remove(smallArray.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(subset(array));
    }
}
