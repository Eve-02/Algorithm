package 链表.t876_链表的中间结点.i1_快慢指针_m;

// https://leetcode.cn/problems/middle-of-the-linked-list/
public class Solution {

    /**
     * 定义两个指针，一个为快指针，一个为慢指针。
     * 如下, 当快指针到达链表尾部时，慢指针将到达 链表中间结点(如有两个中间结点，为第一个)
     *      0 1 2 3 4, (p1 = 0,p2 = 1) -> (p1 = 1, p2 = 3)
     *      0 1 2 3 4 5, (p1 = 0,p2 = 1) -> (p1 = 1, p2 = 3) -> (p1 = 2,p2 = 5)
     *
 *      时间复杂度: O(N)
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head.next;
        if(p2 == null){
            return p1;
        }
        while(p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1.next;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode listNode = new Solution().middleNode(root);
        System.out.println(listNode.val);
    }

}
