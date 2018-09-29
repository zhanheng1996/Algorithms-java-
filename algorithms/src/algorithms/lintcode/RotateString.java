package algorithms.lintcode;

public class RotateString {
    /**
     * @param str:    An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        //思路：复杂度为O(1)，用两层循环类似于冒泡排序，把offset右边的值全部平移到左边
        char temp;
        if(str.length != 0) {
            offset = offset % str.length;
            for (int i = str.length - offset; i < str.length; i++) {
                for (int j = i; j > i - str.length + offset; j--) {
                    temp = str[j];
                    str[j] = str[j - 1];
                    str[j - 1] = temp;
                }
            }
        }
    }
}
