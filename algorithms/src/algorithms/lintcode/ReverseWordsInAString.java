package algorithms.lintcode;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String result = "";
        if (strs.length == 0)
            return s;
        result = strs[0] + result;
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].equals(""))
                result = strs[i] + " " + result;
        }
        return result;
    }
}
