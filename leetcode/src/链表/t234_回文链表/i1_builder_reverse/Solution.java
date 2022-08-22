package 链表.t234_回文链表.i1_builder_reverse;


// https://leetcode.cn/problems/palindrome-linked-list/
public class Solution {

    // 【执行用时：18ms, 在所有 Java 提交中击败了 12.85% 的用户】
    public boolean isPalindrome(ListNode head) {
        StringBuilder builder = new StringBuilder();
        ListNode p = head;
        while(p != null){
            builder.append(p.val);
            p = p.next;
        }
        return builder.toString().equals(builder.reverse().toString());
    }

}
