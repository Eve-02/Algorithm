package 数据结构.t206_反转链表.i1_头插法_m;

//  https://leetcode.cn/problems/reverse-linked-list/
public class Solution {

    /**
     * 时间复杂度: O(N)。其中 N 为链表元素个数。
     *
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
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
