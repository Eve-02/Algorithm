package 链表.t02_01_移除重复节点.i1_集合;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/remove-duplicate-node-lcci/
public class Solution {

    /**
     * 时间复杂度: O(N),空间复杂度: O(N).
     */
    // 【执行用时：4ms, 在所有 Java 提交中击败了 96.18% 的用户】
    public ListNode removeDuplicateNodes(ListNode head) {
        // 输入：[1, 2, 3, 3, 2, 1]
        // 输出：[1, 2, 3]
        if(head == null){
            return null;
        }
        Set<Integer> set = new HashSet<>();
        ListNode front = head;
        ListNode rear = head.next;
        set.add(front.val);
        while(rear != null){
            if(!set.add(rear.val)){
                front.next = rear.next;
            }else{
                front = front.next;
            }
            rear = rear.next;
        }
        return head;
    }

}
