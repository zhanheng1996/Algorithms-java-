package algorithms.lintcode;

import java.util.Scanner;

public class DigitCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(digitCounts(k, n));
    }

    public static int digitCounts(int k, int n) {
        // write your code here
        int count = 0;
        if (k == 0) {
            for (int i = 0; i <= n; i += 10) {
                int temp = i;
                while (temp > 0) {
                    if (temp % 10 == k)
                        count++;
                    temp /= 10;
                }
            }
            return ++count;
        }
        for (int i = k; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == k)
                    count++;
                temp /= 10;
            }
        }
        return count;
    }
}
