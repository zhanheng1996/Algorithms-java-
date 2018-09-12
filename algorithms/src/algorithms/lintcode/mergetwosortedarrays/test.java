package algorithms.lintcode.mergetwosortedarrays;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("请输入第一个数组的大小：");
        m = sc.nextInt();
        int[] A = new int[m];
        System.out.print("请输入数据：");
        for (int i = 0; i < m; i++)
            A[i] = sc.nextInt();
        System.out.print("请输入第二个数组的大小：");
        n = sc.nextInt();
        int[] B = new int[n];
        System.out.print("请输入数据：");
        for (int i = 0; i < n; i++)
            B[i] = sc.nextInt();
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int[] C = mergeTwoSortedArrays.mergeSortedArray(A, B);
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
