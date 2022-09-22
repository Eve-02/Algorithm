package 热题HOT_100.t2_两数相加.i2_确定每一位上的数字_m;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：1ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode front = new ListNode(); // 前指针，头指针
        ListNode p = front; // 链表尾部
        int k = 0; // 保存上一位的进位
        while (l1 != null || l2 != null) { // l1 不为空，或者 l2 不为空时遍历
            int n1 = l1 == null ? 0 : l1.val; // 空位补0
            int n2 = l2 == null ? 0 : l2.val;
            int n = n1 + n2 + k; // 取得当前位的结果
            k = n / 10; // 更新进位
            n %= 10; // 取得当前位
            p.next = new ListNode(n); // 尾插法
            p = p.next;
            l1 = l1 == null ? null : l1.next; // 指针后移
            l2 = l2 == null ? null : l2.next;
        }
        if(k != 0){
            p.next = new ListNode(k); // 最高位可能还有进位
        }
        return front.next; // 返回结果
    }


}
