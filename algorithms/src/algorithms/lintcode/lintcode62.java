package algorithms.lintcode;

public class lintcode62 {
    /**
     * @param A:      an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {
        if (A == null || A.length == 0)
            return -1;
        int index = 0;
        int start = 0;
        int end = A.length;
        boolean flag = false;
        //二分法找到旋转点
        while (start <= end) {
            index = (start + end) / 2;
            if (A[index] > A[0]) {
                if (index >= A.length) {
                    flag = true;
                    break;
                }
                if (A[index] > A[index + 1])
                    break;
                else
                    start = index + 1;
            } else {
                end = index - 1;
            }
        }
        //判断前后区域
        if (!flag) {
            if (A[0] > target) {
                start = index + 1;
                end = A.length;
            } else {
                start = 0;
                end = index;
            }
        }else {
            start = 0;
            end = A.length;
        }
        //二分法查找
        while (start <= end) {
            index = (start + end) / 2;
            if (A[index] == target)
                return index;
            else if (A[index] > target)
                end = index - 1;
            else
                start = index + 1;
        }
        return -1;
    }
}
