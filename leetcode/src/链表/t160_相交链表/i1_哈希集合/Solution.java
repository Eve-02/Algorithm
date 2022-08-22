package 链表.t160_相交链表.i1_哈希集合;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/intersection-of-two-linked-lists/
public class Solution {

    /**
     * 时间复杂度: O(M+N).
     */
    // 【执行用时：9ms, 在所有 Java 提交中击败了 5.38% 的用户】
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;
        Set<ListNode> set = new HashSet<>();
        while(pa != null){
            set.add(pa);
            pa = pa.next;
        }
        while(pb != null){
            if(set.contains(pb)){
                return pb;
            }else{
                pb = pb.next;
            }
        }
        return null;
    }

}
