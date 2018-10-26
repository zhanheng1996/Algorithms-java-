package algorithms.lintcode;

/**
 * @Author: HengZhan
 * @Description:
 * @Date: 2018/10/26
 */
public class MaximumSubarrayDifference {
    /**
     * @param nums: A list of integers
     * @return: An integer indicate the value of maximum difference between two substrings
     */
    public int maxDiffSubArrays(int[] nums) {
        // write your code here
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        int[] max_left = new int[nums.length];
        int[] max_right = new int[nums.length];
        int[] min_left = new int[nums.length];
        int[] min_right = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            sum = Math.max(0, sum);
            max_left[i] = max;
        }
        max = Integer.MIN_VALUE;
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            max = Math.max(sum, max);
            sum = Math.max(0, sum);
            max_right[i] = max;
        }
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            min = Math.min(sum, min);
            sum = Math.min(0, sum);
            min_right[i] = min;
        }
        sum = 0;
        min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(sum, min);
            sum = Math.min(0, sum);
            min_left[i] = min;
        }
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            result = Math.max(result, Math.abs(max_left[i] - min_right[i + 1]));
            result = Math.max(result, Math.abs(min_left[i] - max_right[i + 1]));
        }

        return result;
    }
}
