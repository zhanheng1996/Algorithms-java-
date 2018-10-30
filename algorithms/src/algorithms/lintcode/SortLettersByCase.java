package algorithms.lintcode;

/**
 * @Author: HengZhan
 * @Description:
 * @Date: 2018/10/30
 */
public class SortLettersByCase {
    /*
     * @param chars: The letter array you should sort by Case
     * @return: nothing
     */
    public void sortLetters(char[] chars) {
        // write your code here
        int start = 0, end = chars.length - 1;
        char temp;
        while (start <= end) {
            while (start <= end && Character.isLowerCase(chars[start]) ) start++;
            while (start <= end && Character.isUpperCase(chars[end]) ) end--;
            if (start <= end) {
                temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++; end--;
            }
        }
    }
}
