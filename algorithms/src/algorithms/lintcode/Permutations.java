package algorithms.lintcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    private void helper(int[] nums,
                        boolean[] visited,
                        ArrayList<Integer> ints,
                        List<List<Integer>> result) {
        if (nums.length == ints.size()) {
            result.add(new ArrayList<>(ints));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            ints.add(nums[i]);
            visited[i] = true;
            helper(nums, visited, ints, result);
            visited[i] = false;
            ints.remove(ints.size() - 1);
        }
    }
}
