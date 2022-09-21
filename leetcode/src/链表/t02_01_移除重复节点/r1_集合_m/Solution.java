package 链表.t02_01_移除重复节点.r1_集合_m;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    // 【执行用时：4ms, 在所有 Java 提交中击败了 96.18% 的用户】
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null){
            return head;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode p = head;
        while(p.next != null){
            // 取前驱节点的下一个，待判断的节点
            ListNode node = p.next;
            if(set.add(node.val)){
                p = p.next; // 不包含，前驱节点后移
            }else{
                p.next = p.next.next; // 不包含，删除当前节点(即让前驱节点的next指向当前节点的下一个节点)
            }
        }
        return head;
    }

}
