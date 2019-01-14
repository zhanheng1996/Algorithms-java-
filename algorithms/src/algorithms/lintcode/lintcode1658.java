package algorithms.lintcode;

public class lintcode1658 {
    /**
     * @param str: The identifier need to be judged.
     * @return: Return if str is a legal identifier.
     */
    public boolean isLegalIdentifier(String str) {
        // Write your code here.
        if (str == null || str.length() == 0)
            return false;
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
            return false;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if ((temp >= '0' && temp <= '9') || (temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z') || temp == '_')
                continue;
            return false;
        }
        return true;
    }
}
