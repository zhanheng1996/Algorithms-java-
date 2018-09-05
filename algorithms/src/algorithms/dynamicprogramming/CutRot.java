package algorithms.dynamicprogramming;

import java.util.Scanner;

public class CutRot {
    public static void main(String[] args) {
        int[] prof = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.print("请输入钢条长度：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[] r = new int[n];
        System.out.println("钢条的最大收益为：" + bottomUpCutRod(prof, n));

    }

    //动态规划切割钢条
    static int bottomUpCutRod(int prof[], int n) {
        int profit = 0;
        int[] r = new int[n + 1];
        while (n > 10) {
            n -= 10;
            profit += prof[10];
        }
        for (int i = 1; i <= n; i++) {
            int profit1 = 0;
            for (int j = 1; j <= i && i <= 10; j++) {
                profit1 = max(profit1, prof[j] + r[i - j]);
            }
            r[i] = profit1;
        }
        profit += r[n];
        return profit;
    }

    //最大值函数
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
