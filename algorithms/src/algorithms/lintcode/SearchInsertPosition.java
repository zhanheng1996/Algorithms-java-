package algorithms.lintcode;

public class SearchInsertPosition {
    /**
     * @param A:      an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A.length == 0) {
            return 0;
        }
        int result = 0, begin = 0, end = A.length - 1;
        while (begin < end) {
            result = (begin + end) / 2;
            if (A[result] == target) {
                return result;
            } else if (A[result] < target) {
                begin = result + 1;
            } else {
                end = result - 1;
            }
        }
        if (A[result] < target) {
            return result;
        }
        return result + 1;
    }
}
