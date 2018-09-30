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
        int temp;
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
        //递归方式一：选中元素
        ints.add(nums[n]);
        helper(nums, ints, result, n + 1);
        //递归方式二：没选中元素（空集合）
        ints.remove(ints.size() - 1);
        helper(nums, ints, result, n + 1);
    }
}
