package algorithms.lintcode;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    /**
     * @param numbers: An array of Integer
     * @param target:  target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        Integer result;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            nums.add(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            result = nums.lastIndexOf(target - nums.get(i));
            if (result != -1) {
                int[] results = {i, result};
                return results;
            }
        }
        int[] results = {};
        return results;
    }
}
