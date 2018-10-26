package algorithms.lintcode;

import java.util.List;

/**
 * @Author: HengZhan
 * @Description:
 * @Date: 2018/10/25
 */
public class MaximumSubarrayII {
    /*
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public int maxTwoSubArrays(List<Integer> nums) {
        // write your code here
        int max = Integer.MIN_VALUE, sum = 0;
        int size = nums.size();
        int[] right = new int[size];
        int[] left = new int[size];
        for (int i = 0; i < size; i++) {
            sum += nums.get(i);
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
            left[i] = max;
        }
        max = Integer.MIN_VALUE;
        sum = 0;
        for (int i = size - 1; i >= 0; i--) {
            sum += nums.get(i);
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
            right[i] = max;
            System.out.println(left[i] + "  " + right[i]);
        }
        max = Integer.MIN_VALUE;
        for (int i = 0; i < size - 1; i++) {
            sum = left[i] + right[i + 1];
            max = Math.max(sum, max);
        }
        return max;
    }
}
