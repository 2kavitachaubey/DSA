package BacktrackingSR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class DuplicateSubset {
    public static List<List<Integer>> set(int [] nums){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,list,small);
        return list;
    }
    public static void helper(int [] nums,int start, List<List<Integer>> finalArray, List<Integer> smallArray){
        finalArray.add(new ArrayList<>(smallArray));
        for(int i = start; i<nums.length; i++){
            if(i>start && nums[i] == nums[i-1]){continue;}
            smallArray.add(nums[i]);
            helper(nums,i+1,finalArray,smallArray);
            smallArray.remove(smallArray.size()-1);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        System.out.println(set(arr));
    }
}
