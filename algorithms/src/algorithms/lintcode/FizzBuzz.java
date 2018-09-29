package algorithms.lintcode;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
//        List<String> strings = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            if (i % 15 == 0) {
//                strings.add("fizz buzz");
//            } else if (i % 3 == 0) {
//                strings.add("fizz");
//            } else if (i % 5 == 0) {
//                strings.add("buzz");
//            } else {
//                strings.add(String.valueOf(i));
//            }
//        }
//        return strings;
        List<String> strings = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            String w = help(i, 3, "fizz") + help(i, 15, " ") +  help(i, 5, "buzz");
            if (w.equals("")) {
                w += i;
            }
            strings.add(w);
        }
        return strings;
    }
    public String help(int n, int div, String w) {
        return n % div == 0 ? w : "";
    }
}
