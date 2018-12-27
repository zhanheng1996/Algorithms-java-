package algorithms.lintcode;

import java.util.*;

public class lintcode57 {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    private boolean IsContain(int[] numbers, int i, int j) {
        for (int k = j + 1; k < numbers.length; k++) {
            if (numbers[k] == -(numbers[i] + numbers[j])) {
                return true;
            }
        }
        return false;
    }

    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        int len = numbers.length;
        if (len < 3)
            return result;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (IsContain(numbers, i, j)) {
                    List<Integer> item = new ArrayList<>();
                    item.add(numbers[i]);
                    item.add(numbers[j]);
                    item.add(-(numbers[i] + numbers[j]));
                    Collections.sort(item);
                    result.add(item);
                }
            }
        }
        Set set = new HashSet(result);
        List<List<Integer>> result1 = new ArrayList<>(set);
        return result1;
    }
}
