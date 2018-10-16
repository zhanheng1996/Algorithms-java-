package algorithms.lintcode;

public class CompareStrings {
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        int[] results = new int[26];
        for (int i = 0; i < A.length(); i++) {
            results[A.charAt(i) - 'A']++;
        }
        for (int i = 0; i < B.length(); i++) {
            results[B.charAt(i) - 'A']--;
            if (results[B.charAt(i) - 'A'] < 0) {
                return false;
            }
        }
        return true;
    }
}
