package algorithms.sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < n; m++) {
            array[m] = sc.nextInt();
        }
        quickSort(array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //快速排序
    static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int m = partition(a, low, high);
            quickSort(a, low, m - 1);
            quickSort(a, m + 1, high);
        }
    }

    //快速排序之分区
    static int partition(int a[], int i, int j) {
        int temp;
        int p = a[i];
        int m = i;
        for (int n = i + 1; n <= j; n++) {
            if (a[n] < p) {
                m++;
                temp = a[n];
                a[n] = a[m];
                a[m] = temp;
            }
        }
        temp = a[i];
        a[i] = a[m];
        a[m] = temp;
        for (int n = i; n <= j; n++) {
            System.out.print(a[n] + " ");
        }
        System.out.println("----------");
        return m;
    }
}
