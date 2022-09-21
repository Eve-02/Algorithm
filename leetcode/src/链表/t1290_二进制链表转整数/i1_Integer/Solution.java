package 链表.t1290_二进制链表转整数.i1_Integer;

// https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer/
public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int getDecimalValue(ListNode head) {
        StringBuilder builder = new StringBuilder();
        ListNode p = head;
        while(p != null){
            builder.append(p.val);
            p = p.next;
        }
        return Integer.parseInt(builder.toString(),2);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        new Solution().getDecimalValue(head);
    }

}
