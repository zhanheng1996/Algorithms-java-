package algorithms.lintcode;

import java.util.Stack;

/**
 * @Author: HengZhan
 * @Description:
 * @Date: 2018/10/25
 */
public class ImplementQueuebyTwoStacks {
    Stack<Integer> queue;
    Stack<Integer> temp;
    public ImplementQueuebyTwoStacks() {
        // do intialization if necessary
        queue = new Stack<>();
        temp = new Stack<>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        while(!queue.empty()){
            temp.push(queue.pop());
        }
        temp.push(element);
        while(!temp.empty()){
            queue.push(temp.pop());
        }
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        return queue.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        return queue.peek();
    }
}
