package algorithms.lintcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class lintcode81 {
    /**
     * @param nums: A list of integers
     * @return: the median of numbers
     */
    public int[] medianII(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0)
            return new int[0];
        int[] result = new int[nums.length];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            addNumber(maxHeap, minHeap, nums[i]);
            result[i] = maxHeap.peek();
        }
        return result;
    }

    private void addNumber(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap, int number) {
        maxHeap.offer(number);
        minHeap.offer(maxHeap.poll());
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
}
