package algorithms.lintcode;

public class KthLargestElement {
    public int kthLargestElement(int n, int[] nums) {
        // write your code here
        return partition(nums, 0, nums.length - 1, nums.length - n);
    }

    private int partition(int[] nums, int start, int end, int k) {
        int left = start;
        int right = end;
        int tar = nums[start];
        while (left <= right) {
            while (left <= right && nums[left] < tar) left++;
            while (left <= right && nums[right] > tar) right--;
            if (left <= right) {
                swap(nums, right, left);
                right--;
                left++;
            }
        }
        if (k <= right)
            partition(nums, start, right, k);
        if (k >= left)
            partition(nums, left, end, k);
        return nums[k];
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
