package algorithms.lintcode;

public class lintcode78 {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if (strs == null || strs.length == 0)
            return "";
        String result;
        if (strs.length == 1)
            return strs[0];
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length())
                    return strs[j];
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    result = strs[0].substring(0, i);
                    return result;
                }
            }
        }
        return strs[0];
    }
}
