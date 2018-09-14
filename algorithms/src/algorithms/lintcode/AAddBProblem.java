package algorithms.lintcode;

public class AAddBProblem {
    public static int add(int a, int b) {
        int m = 0;
        int n = 0;
        while (b != 0) {
            m = a ^ b;
            n = (a & b) << 1;
            a = m;
            b = n;
        }
        return a;
    }
}
