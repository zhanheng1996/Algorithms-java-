package algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int cur;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < n; m++) {
            array[m] = sc.nextInt();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    cur = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = cur;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}