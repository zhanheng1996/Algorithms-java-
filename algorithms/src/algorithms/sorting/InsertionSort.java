package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int cur;
        int j;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < n; m++) {
            array[m] = sc.nextInt();
        }

        //插入排序
        for (int i = 1; i < n; i++) {
            cur = array[i];
            for (j = i - 1; j >= 0 && array[j] > cur; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = cur;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}