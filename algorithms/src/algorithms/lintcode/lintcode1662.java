package algorithms.lintcode;

import java.util.Arrays;

public class lintcode1662 {
    /**
     * @param a: the array a
     * @return: return the index of median
     */
    public int getAns(int[] a) {
        // write your code here
        if (a == null || a.length == 0)
            return 0;
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        Arrays.sort(a);
        int number;
        if (a.length % 2 == 0)
            number = a[a.length / 2 - 1];
        else
            number = a[a.length / 2];
        for (int i = 0; i < a.length; i++) {
            if (temp[i] == number)
                return i;
        }
        return 0;

    }
}
