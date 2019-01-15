package algorithms.lintcode;

public class lintcode521 {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        int[] temp = new int[nums.length];
        int result = 1;
        if (nums == null || nums.length == 0)
            return 0;
        boolean flag;
        temp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            flag = false;
            for (int j = 0; j < result; j++) {
                if (nums[i] == temp[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                temp[result] = nums[i];
                result++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
        return result;
    }
}
