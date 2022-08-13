package 数组结构.t206_反转链表.i1_头插法;

//  https://leetcode.cn/problems/reverse-linked-list/
public class Solution {

    /**
     * 时间复杂度: O(N)。其中 N 为链表元素个数。
     *
     */

    public ListNode reverseList(ListNode head) {
        ListNode list = new ListNode(-1);
        while(head != null){
            ListNode p = head;
            head = head.next;
            p.next = list.next;
            list.next = p;
        }
        return list.next;
    }

}
