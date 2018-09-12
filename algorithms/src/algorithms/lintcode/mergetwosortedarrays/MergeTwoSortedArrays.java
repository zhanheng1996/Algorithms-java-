package algorithms.lintcode.mergetwosortedarrays;

public class MergeTwoSortedArrays {
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] C = new int[A.length + B.length];
        int i = 0, m = 0, n = 0;
        while (m < A.length && n < B.length) {
            if (A[m] > B[n])
                C[i++] = B[n++];
            else
                C[i++] = A[m++];
        }

        while (m < A.length)
            C[i++] = A[m++];
        while (n < B.length)
            C[i++] = B[n++];
        return C;
    }
}
