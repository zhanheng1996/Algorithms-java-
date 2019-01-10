package algorithms.lintcode;

public class lintcode74 {
    public static class SVNRepo {
        public static boolean isBadVersion(int k) {
            return true;
        }
    }

    /**
     * @param n: An integer
     * @return: An integer which is the first bad version.
     */

    public int findFirstBadVersion(int n) {
        // write your code here
        if (SVNRepo.isBadVersion(1))
            return 1;
        int start = 1;
        int end = n;
        int index = 0;
        while (start <= end) {
            index = start + (end - start) / 2;
            if (SVNRepo.isBadVersion(index)) {
                if (!SVNRepo.isBadVersion(index - 1)) {
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
