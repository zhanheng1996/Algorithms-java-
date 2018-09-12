package algorithms.lintcode.reversewordsinastring;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWordsInAString.reverseWords(s));
    }
}
