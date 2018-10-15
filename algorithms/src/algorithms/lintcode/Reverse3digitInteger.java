package algorithms.lintcode;

public class Reverse3digitInteger {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int result = 0;
        int temp;
        while (number > 0) {
            temp = number % 10;
            result = result * 10 + temp;
            number /= 10;
        }
        return result;
    }
}
