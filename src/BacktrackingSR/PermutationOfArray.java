package BacktrackingSR;
import java.util.*;
public class PermutationOfArray {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, new ArrayList<Integer>(), list);
        return list;
    }

    public static void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> list) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(nums, temp, list);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(permute(array));
    }
}
