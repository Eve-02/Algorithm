package 链表.t1290_二进制链表转整数.o1_尾部填充_m;

public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        ListNode p = head;
        while(p != null){
            ans <<= 1;
            ans |= p.val;
            p = p.next;
        }
        return ans;
    }

}
