package algorithms.lintcode;

public class lintcode79 {
    /**
     * @param A: A string
     * @param B: A string
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        /*if (A.length() == 0 || B.length() == 0)
            return 0;
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                int index = 0;
                while (i + index < A.length() && j + index < B.length() && A.charAt(i + index) == B.charAt(j + index)) {
                    index++;
                }
                result = Math.max(index, result);
            }
        }*/
        int a = A.length();
        int b = B.length();
        int max = 0;
        int dp[][] = new int[a + 1][b + 1];

        for (int i = 1; i < a + 1; i++) {
            for (int j = 1; j < b + 1; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = 0;
            }
        }

        for (int i = 1; i < a + 1; i++) {
            for (int j = 1; j < b + 1; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
