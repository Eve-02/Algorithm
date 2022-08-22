package 链表.t234_回文链表.r1_数组_双指针;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    // 【执行用时：7ms, 在所有 Java 提交中击败了 47.61% 的用户】
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while(p != null){
            list.add(p.val);
            p = p.next;
        }
        int front = 0;
        int back = list.size()-1;
        while(front < back){
            if(!list.get(front).equals(list.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

}
