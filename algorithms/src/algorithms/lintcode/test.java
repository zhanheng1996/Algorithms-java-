package algorithms.lintcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] args) {
        PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());
        a.add(1);
        a.add(3);
        a.add(2);
        System.out.println(a.poll()+" "+a.poll());
    }
}
