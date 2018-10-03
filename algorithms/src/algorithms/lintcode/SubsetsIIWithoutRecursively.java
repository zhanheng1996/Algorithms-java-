package algorithms.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsIIWithoutRecursively {
    /**
     * @param nums: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < (1 << nums.length); i++) {
            List<Integer> n = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    n.add(nums[j]);
                }
            }
            if (!result.contains(n)) {
                result.add(n);
            }
        }
        return result;
    }
}
