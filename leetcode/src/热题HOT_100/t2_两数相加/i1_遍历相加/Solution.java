package 热题HOT_100.t2_两数相加.i1_遍历相加;

// https://leetcode.cn/problems/add-two-numbers/
public class Solution {

    /**
     * 通过测试用例：
     * 1565 / 1568
     *
     * 最后输入：
     * [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]  / 31位
     * [5,6,4]
     *
     * long类型范围: -9223372036854775808到 9223372036854775807
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long n1 = 0,n2 = 0;
        ListNode p1 = l1,p2 = l2;
        int count1 = 0,count2 = 0;
        while(p1 != null){
            n1 += p1.val * Math.pow(10,count1++);
            p1 = p1.next;
        }
        while(p2 != null){
            n2 += p2.val * Math.pow(10,count2++);
            p2 = p2.next;
        }
        String ans = (n1 + n2) + "";
        int len = ans.length();
        ListNode head = new ListNode(ans.charAt(len-1)-'0');
        ListNode p = head;
        for(int i=len-2;i>=0;i--){
            int val = ans.charAt(i) - '0';
            p.next = new ListNode(val);
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next= new ListNode(4);
        ListNode node = new Solution().addTwoNumbers(l1, l2);
        ListNode p = node;
        while(p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }

}
