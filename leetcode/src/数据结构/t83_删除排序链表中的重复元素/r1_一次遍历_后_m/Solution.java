package 数据结构.t83_删除排序链表中的重复元素.r1_一次遍历_后_m;

public class Solution {

    /**
     * 时间复杂度: O(N)。
     */
    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        // p、p.next 不能为空
        while(p != null && p.next != null){
            if(p.val == p.next.val){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return head;
    }


}
