package algorithms.lintcode;

import java.util.LinkedList;
import java.util.Scanner;

public class UglyNumberII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthUglyNumber(n));
    }

    public static int nthUglyNumber(int n) {
        if (n == 1)
            return 1;
        n--;
        int result = 0;
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        int x = 0, y = 0, z = 0;
        while (n > 0) {
            int x1 = a.get(x) * 2;
            int y1 = a.get(y) * 3;
            int z1 = a.get(z) * 5;
            result = Math.min(x1, Math.min(y1, z1));
            if (x1 == result) x++;
            if (y1 == result) y++;
            if (z1 == result) z++;
            a.add(result);
            n--;
        }
        return result;
    }

}
