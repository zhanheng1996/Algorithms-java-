package algorithms.lintcode;

public class lintcode80 {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        return partition(nums, 0, nums.length - 1, (nums.length - 1) / 2);
    }

    private int partition(int[] nums, int left, int right, int mid) {
        if (left == right)
            return nums[mid];
        int start = left;
        int end = right;
        int pivot = nums[end + (start - end) / 2];
        while (start <= end) {
            while (start <= end && nums[start] < pivot)
                start++;
            while (start <= end && nums[end] > pivot)
                end--;
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        if (mid <= end)
            return partition(nums, left, end, mid);
        else if (mid >= start)
            return partition(nums, start, right, mid);
        return nums[mid];
    }
}
