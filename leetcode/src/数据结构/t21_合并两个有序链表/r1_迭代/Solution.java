package 数据结构.t21_合并两个有序链表.r1_迭代;

// https://leetcode.cn/problems/merge-two-sorted-lists/
public class Solution {

    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                prev.next = list1;
                list1 = list1.next;
            }else{
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 == null?list2:list1;

        return prehead.next;
    }

}
