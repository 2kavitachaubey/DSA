package leetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> sum(int[] nums,int target){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        helper(nums,target,list,small,0,0);
        return list;
    }
    public static void helper(int[]nums,int target,List<List<Integer>> finalList,List<Integer> smallList,int index,int sum){
        if(sum > target){
            return;
        }
        if(sum == target){
            finalList.add(new ArrayList<>(smallList));
            return;
        }
        for(int i = index; i<nums.length;i++){
            smallList.add(nums[i]);
            helper(nums,target,finalList,smallList,i,sum+nums[i]);
            smallList.remove(smallList.size()-1);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4};
        System.out.println(sum(arr,7));
    }
}
