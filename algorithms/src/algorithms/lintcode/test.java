package algorithms.lintcode;

public class test {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 1;
        a[1][0] = 2;
        a[1][1] = 2;
        int[] temp;
        temp = a[0];
        a[0] = a[1];
        a[1] = temp;
        System.out.println(a[1][0] + " " + a[1][1]);
    }
}
