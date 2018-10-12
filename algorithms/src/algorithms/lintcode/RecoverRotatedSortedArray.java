package algorithms.lintcode;

import java.util.List;

public class RecoverRotatedSortedArray {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        int count = 0;
        while (nums.get(0) <= nums.get(1) && count < nums.size() - 1) {
            nums.add(nums.get(0));
            nums.remove(0);
            count++;
        }
        nums.add(nums.get(0));
        nums.remove(0);
    }
}
