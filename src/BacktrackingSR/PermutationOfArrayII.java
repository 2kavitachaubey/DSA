package BacktrackingSR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfArrayII {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] isVisited= new boolean[nums.length];
        backtrack(nums, new ArrayList<Integer>(), list,isVisited);
        return list;
    }

    public static void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> list,boolean[] isVisited) {
        if (temp.size() == nums.length && !list.contains(temp)) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(isVisited[i]){continue;}
            temp.add(nums[i]);
            isVisited[i] = true;
            backtrack(nums, temp, list,isVisited);
            temp.remove(temp.size() - 1);
            isVisited[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,1};
        System.out.println(permute(array));
    }
}
