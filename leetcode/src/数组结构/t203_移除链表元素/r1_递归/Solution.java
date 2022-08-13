package 数组结构.t203_移除链表元素.r1_递归;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;
    }

}
