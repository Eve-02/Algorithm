package 链表.t234_回文链表.r2_快慢指针;

public class Solution {

    /**
     * 避免使用 O(n)O(n) 额外空间的方法就是改变输入。
     * 我们可以将链表的后半部分反转（修改链表结构），
     * 然后将前半部分和后半部分进行比较。比较完成后我们
     * 应该将链表恢复原样。虽然不需要恢复也能通过测试用例，
     * 但是使用该函数的人通常不希望链表结构被更改。
     * 该方法虽然可以将空间复杂度降到 O(1)O(1)，但是在并发环境下，该
     * 方法也有缺点。在并发环境下，函数运行时需要锁定其他线程或进程
     * 对链表的访问，因为在函数执行过程中链表会被修改。
     *
     * 整个流程可以分为以下五个步骤：
     * 1.找到前半部分链表的尾节点。
     * 2.反转后半部分链表。
     * 3.判断是否回文。
     * 4.恢复链表。
     * 5.返回结果。
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        // 找到前半部分链表的尾节点并反转后半部分链表
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        // 判断是否回文
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while(result && p2 != null){
            if(p1.val != p2.val){
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 还原链表并返回结果
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

    /**
     * 我们也可以使用快慢指针在一次遍历中找到：慢指针一次走一步，
     * 快指针一次走两步，快慢指针同时出发。当快指针移动到链表的末尾时，
     * 慢指针恰好到链表的中间。通过慢指针将链表分为两部分。
     *
     * 若链表有奇数个节点，则中间的节点应该看作是前半部分。
     * 1 2 3 4 5 6 -> fast=5,slow=3
     * 1 2 3 4 5 -> fast=5,slow=3
     */
    private ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

}
