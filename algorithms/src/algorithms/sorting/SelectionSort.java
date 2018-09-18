package algorithms.sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int cur;
        int index = 0;
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < n; m++) {
            array[m] = sc.nextInt();
        }
        //选择排序
        for (int i = 0; i < n - 1; i++) {
            index = i;
            for (int j = i; j < n - 1; j++) {
                if (array[index] > array[j + 1])
                    index = j + 1;
            }
            cur = array[index];
            array[index] = array[i];
            array[i] = cur;
        }
//        for (int i = n - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[index] < array[j + 1])
//                    index = j + 1;
//            }
//            cur = array[index];
//            array[index] = array[i];
//            array[i] = cur;
//            index = 0;
//        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
