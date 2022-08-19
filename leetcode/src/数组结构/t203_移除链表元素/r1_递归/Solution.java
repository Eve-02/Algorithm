package 数组结构.t203_移除链表元素.r1_递归;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：1ms, 在所有 Java 提交中击败了 49.57% 的用户】
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;
    }

}
