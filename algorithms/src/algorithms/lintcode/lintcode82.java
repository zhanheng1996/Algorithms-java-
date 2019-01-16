package algorithms.lintcode;

public class lintcode82 {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        /*int count;
        for (int i = 0; i < A.length; i++) {
            count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j])
                    count++;
            }
            if (count == 1)
                return A[i];
        }
        return 0;*/
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }
}
