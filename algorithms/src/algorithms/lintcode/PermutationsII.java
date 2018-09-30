package algorithms.lintcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
    /*
     * @param :  A list of integers
     * @return: A list of unique permutations
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    private void helper(int[] nums,
                        boolean[] visited,
                        ArrayList<Integer> ints,
                        List<List<Integer>> result) {
        boolean flag = true;
        if (nums.length == ints.size()) {
            if (nums.length == 0) {
                result.add(new ArrayList<>(ints));
            }
            for (int i = 0; i < result.size(); i++) {
                if (ints.equals(result.get(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(new ArrayList<>(ints));
            }
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
