package algorithms.lintcode;

import java.util.List;

public class lintcode51 {
    /*
     * @param nums: A list of integers
     * @return: A list of integers that's previous permuation
     */
    private void swap(List<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }

    private void resever(List<Integer> a, int i, int j) {
        while (j > i) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public List<Integer> previousPermuation(List<Integer> nums) {
        // write your code here
        int len = nums.size();
        if (len <= 1)
            return nums;
        int i = len - 1;
        while (i > 0 && nums.get(i) >= nums.get(i - 1))
            i--;
        resever(nums, i, len - 1);
        if (i != 0) {
            int j = i;
            while (nums.get(j) >= nums.get(i - 1)) j++;
            swap(nums, j, i - 1);
        }
        return nums;
    }
}
