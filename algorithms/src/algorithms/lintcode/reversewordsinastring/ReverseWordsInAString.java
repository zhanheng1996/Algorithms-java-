package algorithms.lintcode.reversewordsinastring;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] strs = s.split("\\s+");
        String result = "";
        if (strs.length == 0)
            return s;
        result = strs[0] + result;
        for (int i = 1; i < strs.length; i++)
            result = strs[i] + " " + result;
        return result;
    }
}
