package algorithms;

import java.util.Scanner;

public class MaxConnectComponents {
    public static int count = 0, max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strs = str.substring(2, str.length() - 2).split("],\\[");
        int[][] num = new int[strs.length][strs[0].split(",").length];
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0, n = 0; j < strs[0].split(",").length; j++, n += 2) {
                num[i][j] = Integer.parseInt(strs[i].substring(n, n + 1));
            }
        }
        System.out.println(max(num));
    }

    static int max(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if (num[i][j] == 1) {
                    max = 1;
                    erase(num, i, j);
                    if (max > count) {
                        count = max;
                    }
                }
            }
        }
        return count;
    }

    static void erase(int[][] num, int i, int j) {
        num[i][j] = 0;
        while (i - 1 >= 0 && num[i - 1][j] == 1) {
            max++;
            erase(num, i - 1, j);
        }
        while (i + 1 < num.length && num[i + 1][j] == 1) {
            max++;
            erase(num, i + 1, j);
        }
        while (j - 1 >= 0 && num[i][j - 1] == 1) {
            max++;
            erase(num, i, j - 1);
        }
        while (j + 1 < num[0].length && num[i][j + 1] == 1) {
            max++;
            erase(num, i, j + 1);
        }
    }
}
