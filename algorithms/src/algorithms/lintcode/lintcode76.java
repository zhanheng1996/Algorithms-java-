package algorithms.lintcode;

public class lintcode76 {
    /**
     * @param nums: An integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp[i] = dp[i] > dp[j] + 1 ? dp[i] : dp[j] + 1;
            }
            if (max < dp[i])
                max = dp[i];
        }
        return max;
    }
}
