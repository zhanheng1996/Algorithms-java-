package algorithms.lintcode;

public class InterleavingString {
    /**
     * @param s1: A string
     * @param s2: A string
     * @param s3: A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        int m = s1.length();
        int n = s2.length();
        if (m + n != s3.length()) {
            return false;
        }
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= m; i++) {
            if (s3.charAt(i - 1) == s1.charAt(i - 1) && dp[i - 1][0])
                dp[i][0] = true;
        }
        for (int j = 1; j <= n; j++) {
            if (s3.charAt(j - 1) == s2.charAt(j - 1) && dp[0][j - 1])
                dp[0][j] = true;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if ((dp[i - 1][j] && s3.charAt(i + j - 1) == s1.charAt(i - 1)) ||
                        (dp[i][j - 1] && s3.charAt(i + j - 1) == s2.charAt(j - 1))) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[m][n];
    }
}
