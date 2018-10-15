package algorithms.lintcode;

import java.util.LinkedList;
import java.util.List;

public class ProductOfArrayExcludeItself {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        long result = 1;
        int size = nums.size();
        List<Long> results = new LinkedList<>();
        results.add(result);
        for (int i = 1; i < size; i++) {
            result *= nums.get(i - 1);
            results.add(result);
        }
        result = 1;
        for (int i = size - 1; i > 0; i--) {
            result *= nums.get(i);
            results.set(i - 1, result * results.get(i - 1));
        }
        return results;
    }
}
