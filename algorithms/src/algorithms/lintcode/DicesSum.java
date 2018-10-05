package algorithms.lintcode;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DicesSum {
    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
        // Write your code here
        // Ps. new AbstractMap.SimpleEntry<Integer, Double>(sum, pro)
        // to create the pair
        List<Map.Entry<Integer, Double>> result = new ArrayList<>();
        double[][] dp = new double[n + 1][n * 6 + 1];
        for (int i = 1; i < 7; i++) {
            dp[1][i] = 1.0 / 6;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * i; j++) {
                for (int m = 1; m <= 6; m++) {
                    if (j > m) {
                        dp[i][j] += dp[i - 1][j - m];
                    }
                }
                dp[i][j] /= 6.0;
            }
        }
        for (int i = n; i <= 6 * n; ++i) {
            result.add(new AbstractMap.SimpleEntry<>(i, dp[n][i]));
        }
        return result;
    }
}
