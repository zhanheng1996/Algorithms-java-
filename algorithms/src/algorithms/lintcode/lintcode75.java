package algorithms.lintcode;

public class lintcode75 {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int start = 0, end = A.length - 1;
        int index = 0;
        while (start <= end) {
            index = start + (end - start) / 2;
            if (A[index] > A[index + 1]) {
                if (A[index] > A[index - 1]) {
                    return index;
                } else {
                    end = index - 1;
                }
            } else {
                start = index + 1;
            }
        }
        return index;
    }
}
