package 数组结构.t83_删除排序链表中的重复元素.i1_一次遍历_前;

// https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
public class Solution {

    /**
     * 遍历每一个节点，若该节点与上个节点值相同，则删除该节点。
     * 时间复杂度: O(N)。
     */

    public ListNode dedleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode p = head.next;
        while(p != null){
            if(pre.val == p.val){
                pre.next = p.next;
            }else{
                pre = p;
            }
            p = p.next;
        }
        return head;
    }

}
