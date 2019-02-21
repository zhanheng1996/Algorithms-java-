package algorithms.lintcode;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int a[] = new int[] {1, 3, 4, 6, 8, 9};
        int x1 = Arrays.binarySearch(a, 3, 4, 2);
        int x2 = Arrays.binarySearch(a, 1, 3, 5);
        int x3 = Arrays.binarySearch(a, 1, 4, 5);
        int x4 = Arrays.binarySearch(a, 1, 3, 10);
        System.out.println("x1:" + x1 + ", x2:" + x2);
        System.out.println("x3:" + x3 + ", x4:" + x4);
    }
}
