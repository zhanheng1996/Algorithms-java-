package algorithms.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, new ArrayList<>(), result, 0);
        return result;
    }

    private void helper(int[] nums,
                        ArrayList<Integer> ints,
                        List<List<Integer>> result,
                        int n) {
        //递归出口
        if (nums.length == n) {
            result.add(new ArrayList<>(ints));
            return;
        }
        ints.add(nums[n]);
        helper(nums, ints, result, n + 1);
        ints.remove(ints.size() - 1);
        helper(nums, ints, result, n + 1);
    }
}
