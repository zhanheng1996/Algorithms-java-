package algorithms.lintcode;

public class lintcode63 {
    /**
     * @param A:      an integer ratated sorted array and duplicates are allowed
     * @param target: An integer
     * @return: a boolean
     */
    public boolean search(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0)
            return false;
        int start = 0;
        int end = A.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target)
                return true;
            if (A[start] < A[mid]) {
                if (A[start] <= target && target <= A[mid])
                    end = mid;
                else
                    start = mid;
            } else if (A[start] > A[mid]) {
                if (A[mid] <= target && target <= A[end])
                    start = mid;
                else
                    end = mid;
            } else {
                start++;
            }
        }
        if (A[start] == target || A[end] == target)
            return true;
        return false;
    }
}
