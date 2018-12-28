package algorithms.lintcode;

public class lintcode59 {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target:  An integer
     * @return: return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        int len = numbers.length;
        if (len < 3)
            return 0;
        int result = Integer.MAX_VALUE;
        int temp;
        int re = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1])
                continue;
            for (int j = i + 1; j < len; j++) {
                if (j > i + 1 && numbers[j] == numbers[j - 1])
                    continue;
                for (int k = j + 1; k < len; k++) {
                    temp = numbers[i] + numbers[j] + numbers[k];
                    if (Math.abs(target - temp) == 0)
                        return target;
                    if (re > Math.abs(target - temp)) {
                        re = Math.abs(target - temp);
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
