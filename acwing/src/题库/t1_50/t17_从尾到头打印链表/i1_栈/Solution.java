package 题库.t1_50.t17_从尾到头打印链表.i1_栈;

import java.util.Stack;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    public int[] printListReversingly(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
