package 数组结构.t232_用栈实现队列.i1_m;

import java.util.Stack;

// https://leetcode.cn/problems/implement-queue-using-stacks/
public class MyQueue {

    /**
     * 队列：先进先出，栈: 后进先出
     * 因此，后进的，放置在栈的部；原先进的元素保持在栈顶部先出。
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    Stack<Integer> assistStack;
    Stack<Integer> dataStack;

    public MyQueue() {
        assistStack = new Stack<>();
        dataStack = new Stack<>();
    }

    /**
     * 入队列时间复杂度: O(N).
     */
    public void push(int x) {
        while(!dataStack.isEmpty()){
            assistStack.push(dataStack.pop());
        }
        dataStack.push(x);
        while(!assistStack.isEmpty()){
            dataStack.push(assistStack.pop());
        }
    }

    // 栈的顶部就是最先进的那个元素，因为后进的都在栈的底部
    public int pop() {
        return dataStack.pop();
    }

    public int peek() {
        return dataStack.peek();
    }

    public boolean empty() {
        return dataStack.isEmpty();
    }

}
