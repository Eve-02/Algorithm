package 哈希表.t202_快乐数.r1_快慢指针_m;

public class Solution {


    /**
     * 我们不是只跟踪链表中的一个值，而是跟踪两个值，称为快跑者和慢跑者。在算法的每一步中，
     * 慢跑者在链表中前进 1 个节点，快跑者前进 2 个节点(对 getNext(n) 的嵌套调用)。
     *     如果 n 是一个快乐数，即没有循环，那么快跑者最终会比慢跑者先到达数字 1。
     *     如果 n 不是一个快乐数，那么最终快跑者和慢跑者将在同一个数字上相遇。
     * (注：快慢者可能会跳过 1，但是 1 的下一位还是 1，所以就算跳过了也无济于事.)
     *
     * 时间复杂度: O(LogN),空间复杂度: O(1).不需要集合来检测循环.
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while(fastRunner != 1 && slowRunner != fastRunner){
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    public int getNext(int n){
        int res = 0;
        while(n > 0){
            int d = n%10;
            n /= 10;
            res += d*d;
        }
        return res;
    }

}
