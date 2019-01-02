package algorithms.lintcode;

public class lintcode61 {
    /**
     * @param A:      an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        int[] result;
        int start = 0;
        int end = A.length;
        int index = 0;
        boolean falg = false;
        while (start < end) {
            index = (start + end) / 2;
            if (A[index] < target) {
                start = index + 1;
            } else if (A[index] == target) {
                falg = true;
                break;
            } else {
                end = index - 1;
            }
        }
        if (falg) {
            int a = index - 1, b = index + 1;
            while (a >= 0 && A[a] == target)
                a--;
            while (b < A.length && A[b] == target)
                b++;
            result = new int[]{++a, --b};
        } else
            result = new int[]{-1, -1};
        return result;
    }
}
