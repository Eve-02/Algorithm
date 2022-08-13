package 数组结构.t203_移除链表元素.i1_迭代;

// https://leetcode.cn/problems/remove-linked-list-elements/
public class Solution {

    /**
     * 一次遍历，若与 val 值相等，则向下移动。
     * 时间复杂度: O(N)。其中 N 为链表元素个数。
     */

    public ListNode removeElements(ListNode head, int val) {
        ListNode list = new ListNode(-1,head);
        ListNode p = head;
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
