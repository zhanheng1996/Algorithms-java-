package algorithms.lintcode;

import java.util.LinkedList;
import java.util.List;

public class lintcode84 {
    /**
     * @param A: An integer array
     * @return: An integer array
     */
    public List<Integer> singleNumberIII(int[] A) {
        // write your code here
        if (A == null || A.length == 0)
            return new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        int all = 0;
        int last = 0;
        for (int i = 0; i < A.length; i++) {
            all ^= A[i];
        }
        while (all % 2 == 0) {
            last++;
            all >>= 1;
        }
        int r1 = 0, r2 = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] >> last) % 2 == 0) {
                r1 ^= A[i];
            } else {
                r2 ^= A[i];
            }
        }
        result.add(r1);
        result.add(r2);
        return result;
    }
}
