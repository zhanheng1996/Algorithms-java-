package algorithms.lintcode;

import java.util.List;

public class MinimumSubarray {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int size = nums.size();
        int min = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums.get(i);
            min = Math.min(min, sum);
            sum = Math.min(sum, 0);
        }
        return min;
    }
}
