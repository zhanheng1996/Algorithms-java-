package algorithms.sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < n; m++) {
            array[m] = sc.nextInt();
        }
        //归并排序
        mergeSort(array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }

    //归并排序
    static void mergeSort(int a[], int low, int high) {
        // 要排序的数组是 a[low..high]
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid); // 分成一半
            mergeSort(a, mid + 1, high); // 递归地将它们排序
            mergeSortSmallProgram(a, low, mid, high); // 解决: 归并子程序
        }
    }

    //归并排序递归小程序
    static void mergeSortSmallProgram(int[] a, int low, int mid, int high) {
        int n = high - low + 1;
        int[] b = new int[n];
        int left = low, right = mid + 1, bindex = 0;
        while (left <= mid && right <= high) {
            if (a[left] < a[right])
                b[bindex++] = a[left++];
            else
                b[bindex++] = a[right++];
        }
        while (left <= mid) {
            b[bindex++] = a[left++];
        }
        while (right <= high) {
            b[bindex++] = a[right++];
        }
        for (int i = 0; i < n; i++) {
            a[low + i] = b[i];
            System.out.print(b[i] + " ");
        }
        System.out.println("------------");
    }
}
