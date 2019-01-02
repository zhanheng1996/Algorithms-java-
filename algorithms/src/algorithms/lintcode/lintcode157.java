package algorithms.lintcode;

public class lintcode157 {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i + 1).contains(str.substring(i, i + 1)))
                return false;
        }
        return true;
    }
}
