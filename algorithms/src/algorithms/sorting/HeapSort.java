package algorithms.sorting;

import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < n; m++) {
            array[m] = sc.nextInt();
        }
        heapSort(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //堆排序
    static void heapSort(int a[], int heapSize) {
        buildMaxHeap(a, heapSize);
        int temp;
        for (int i = a.length - 1; i >= 1; i--) {
            temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapSize--;
            buildMaxHeap(a, heapSize);
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("----------");
        }
    }

    //构建最大堆
    static void buildMaxHeap(int a[], int heapSize) {
        for (int i = (a.length - 2) / 2; i >= 0; i--) {
            maxHeapify(a, heapSize, i);
        }
    }

    //调整最大堆
    static void maxHeapify(int a[], int heapSize, int i) {
        int largest = i;
        int temp;
        int l = getLeftChild(i);
        int r = getRightChild(i);
        if (l < heapSize && a[largest] < a[l])
            largest = l;
        if (r < heapSize && a[largest] < a[r])
            largest = r;
        if (largest != i) {
            temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
            maxHeapify(a, heapSize, largest);
        }
    }

    //获取左孩子节点
    static int getLeftChild(int n) {
        return 2 * n + 1;
    }

    //获取右孩子节点
    static int getRightChild(int n) {
        return 2 * n + 2;
    }
}
