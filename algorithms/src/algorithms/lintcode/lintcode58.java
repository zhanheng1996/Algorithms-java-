package algorithms.lintcode;

import java.util.*;

public class lintcode58 {
    /**
     * @param numbers: Give an array
     * @param target:  An integer
     * @return: Find all unique quadruplets in the array which gives the sum of zero
     */
    private boolean IsContain(int[] numbers, int i, int j, int k, int target) {
        for (int n = k + 1; n < numbers.length; n++) {
            if (numbers[n] == target - numbers[i] - numbers[j] - numbers[k])
                return true;
        }
        return false;
    }

    public List<List<Integer>> fourSum(int[] numbers, int target) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        int len = numbers.length;
        if (len < 4)
            return result;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (IsContain(numbers, i, j, k, target)) {
                        List<Integer> item = new ArrayList<>();
                        item.add(numbers[i]);
                        item.add(numbers[j]);
                        item.add(numbers[k]);
                        item.add(target - (numbers[i] + numbers[j] + numbers[k]));
                        Collections.sort(item);
                        result.add(item);
                    }
                }
            }
        }
        Set set = new HashSet(result);
        List<List<Integer>> result1 = new ArrayList<>(set);
        return result1;
    }
}
