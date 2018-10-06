package algorithms.lintcode;

public class PartitionArray {
    /**
     * @param nums: The integer array you should partition
     * @param k:    An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        //求解并且对数组进行一次分区
        int temp, index = 0;
        int i = 0, j = nums.length - 1;
        while (j > i) {
            if (nums[i] >= k && nums[j] < k) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] < k) {
                i++;
                index++;
            }
            if (nums[j] >= k) {
                j--;
            }
        }
        return index;
        //最简单的解法，但是并没有对数组进行分区
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < k) {
//                index++;
//            }
//        }
//        return index;
    }
}
