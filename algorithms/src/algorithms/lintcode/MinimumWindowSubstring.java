package algorithms.lintcode;

public class MinimumWindowSubstring {
    int[] chars = new int[256];

    /**
     * @param source  : A string
     * @param target: A string
     * @return: A string denote the minimum window, return "" if there is no such a string
     */
    public String minWindow(String source, String target) {
        // write your code here
        //第一种解法用hashmap
//        HashMap<Character, Integer> map = new HashMap<>();
//        int tSize = target.length();
//        int sSize = source.length();
//        //将target字符串中所有的字符放入map中
//        for (int i = 0; i < tSize; i++) {
//            char c = target.charAt(i);
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c) + 1);
//            } else {
//                map.put(c, 1);
//            }
//        }
//        String result = "";
//        int min = Integer.MAX_VALUE;
//        int n = 0, j = 0;
//        for (int i = 0; i < sSize; i++) {
//            if (map.containsKey(source.charAt(i))) {
//                //找到符合条件的子串
//                while (j < sSize && n < tSize) {
//                    char c = source.charAt(j);
//                    if (map.containsKey(c)) {
//                        if (map.get(c) > 0) {
//                            n++;
//                        }
//                        map.put(c, map.get(c) - 1);
//                    }
//                    j++;
//                }
//                //替换result
//                if (n == tSize && min > j - i) {
//                    min = j - i;
//                    result = source.substring(i, j);
//                }
//                //判断是否要将第一个字符重新放回map中
//                char c = source.charAt(i);
//                if (map.containsKey(c)) {
//                    if (map.get(c) >= 0) {
//                        n--;
//                    }
//                    map.put(c, map.get(c) + 1);
//                }
//            }
//        }
//        return result;
//    }
        //第二种解法不用hashmap
        int tSize = target.length();
        int sSize = source.length();
        //将target里面的每个字符放入数组中
        for (int i = 0; i < tSize; i++) {
            chars[target.charAt(i)]++;
        }
        String result = "";
        int j = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < sSize; i++) {
            while (j < sSize && !isFindAll()) {
                chars[source.charAt(j)]--;
                j++;
            }
            if (isFindAll() && j - i < min) {
                min = j - i;
                result = source.substring(i, j);
            }
            chars[source.charAt(i)]++;
        }
        return result;
    }

    //判断是否所有字符都被寻找到了
    private boolean isFindAll() {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
