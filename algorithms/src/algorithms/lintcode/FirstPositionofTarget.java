package algorithms.lintcode;

public class FirstPositionofTarget {
    /**
     * @param nums:   The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int start = 0;
        int end = nums.length - 1;
        int size;
        int n = -1;
        while (start <= end) {
            n = (end + start) / 2;
            if (target == nums[n]) {
                size = n - 1;
                while (size >= 0 && target == nums[size]) {
                    size--;
                }
                size++;
                return size;
            } else if (target > nums[n]) {
                start = n + 1;
            } else {
                end = n - 1;
            }
        }
        return -1;
    }
}
