package 数据结构.t141_环形链表.i1_哈希表;


import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/linked-list-cycle/
public class Solution {

    /**
     * 遍历链表，将节点添加到 Set 中，若添加失败，说明构成环。
     *
     * 时间复杂度: O(N)。其中 N 为链表的长度。
     *
     */
    // 【执行用时：3ms, 在所有 Java 提交中击败了 22.06% 的用户】
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        Set<ListNode> set = new HashSet<>();
        while(p != null){
            if(!set.add(p)){
                return true;
            }
            p = p.next;
        }
        return false;
    }
}

