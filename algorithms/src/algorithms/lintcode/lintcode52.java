package algorithms.lintcode;

public class lintcode52 {
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void resever(int[] a, int i, int j) {
        while (j > i) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public int[] nextPermutation(int[] nums) {
        int len = nums.length;
        if (len <= 1)
            return nums;
        int i = len - 1;
        while (i > 0 && nums[i] <= nums[i - 1])
            i--;
        resever(nums, i, len - 1);
        if (i != 0) {
            int j = i;
            while (nums[j] <= nums[i - 1]) j++;
            swap(nums, j, i - 1);
        }
        return nums;
    }
}
