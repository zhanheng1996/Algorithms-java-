package algorithms.lintcode;

public class test {
    public static void main(String[] args) {
        int xor = 6223;
        int c = xor - (xor & (xor - 1));
        System.out.println(c);
        System.out.println(12^22^22^13);
    }
}
