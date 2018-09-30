package algorithms.lintcode;

public class ImplementstrStr {
    /**
     * @param source:
     * @param target:
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        if (target.equals(""))
            return 0;
        int t_size = target.length();
        int size = source.length() - target.length() + 1;
        for (int i = 0; i < size; i++) {
            if (source.substring(i,i+t_size).equals(target)){
                return i;
            }
        }
        return -1;
    }
}
