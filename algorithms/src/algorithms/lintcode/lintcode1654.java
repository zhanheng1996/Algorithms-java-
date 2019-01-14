package algorithms.lintcode;

public class lintcode1654 {
    /**
     * @param str: the str
     * @return: the sum that the letter appears the most
     */
    public int mostFrequentlyAppearingLetters(String str) {
        // Write your code here.
        int result = 0;
        int size = 'z';
        int[] map = new int[size + 1];
        for (int i = 0; i < str.length(); i++) {
            map[str.charAt(i)]++;
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] > result)
                result = map[i];
        }
        return result;
    }
}
