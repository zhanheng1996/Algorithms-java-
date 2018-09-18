package algorithms.lintcode;

public class UglyNumber {
    public boolean isUgly(int num) {
        // write your code here
        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;
        if (num == 1)
            return true;
        else
            return false;
    }
}
