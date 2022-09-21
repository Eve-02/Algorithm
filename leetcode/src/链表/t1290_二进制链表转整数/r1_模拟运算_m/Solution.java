package 链表.t1290_二进制链表转整数.r1_模拟运算_m;

public class Solution {

    /**
     * 比如: 101.
     * 对其进行遍历，
     *      1. ans = 1*(2^0).
     *      2. ans = 1*(2^1) + 0*(2^0) = ans*2 + 0*(2^0)
     *      3. ans = 1*(2^2) + 0*(2^1) + 0*(2^0) = ans*2 + 0*(2^0)
     *  时间复杂度: O(N). 空间复杂度: O(1).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int getDecimalValue(ListNode head){
        ListNode p = head;
        int ans = 0;
        while(p != null){
            ans = ans*2 + p.val;
            p = p.next;
        }
        return ans;
    }

}
