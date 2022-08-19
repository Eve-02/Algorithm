package 数组结构.t203_移除链表元素.i1_迭代_m;

// https://leetcode.cn/problems/remove-linked-list-elements/
public class Solution {

    /**
     * 一次遍历，若与 val 值相等，则向下移动。
     * 时间复杂度: O(N)。其中 N 为链表元素个数。
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public ListNode removeElements(ListNode head, int val) {
        ListNode list = new ListNode(-1,head);
        ListNode p = list;
        while(p.next != null){
            if(p.next.val == val){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return list.next;
    }


}
