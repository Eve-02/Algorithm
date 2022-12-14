package 位运算.t137_只出现一次的数字2.r1_位运算_m;


public class Solution {

    /**
     * 具体地，考虑答案的第 i 个二进制位（i 从 0 开始编号），它可能为 0 或 1。对于数组中非答案的元素，
     * 每一个元素都出现了 3 次，对应着第 i 个二进制位的 3 个 0 或 3 个 1，无论是哪一种情况，
     * 它们的和都是 3 的倍数（即和为 0 或 3）。因此：
     * 答案的第 i 个二进制位就是数组中所有元素的第 i 个二进制位之和除以 3 的余数。
     *
     * 我们使用位运算 (x >> i) & 1} 得到 x 的第 i 个二进制位，
     * 并将它们相加再对 3 取余，得到的结果一定为 0 或 1，
     * 即为答案的第 i 个二进制位。
     *
     * 时间复杂度: O(N).
     * 空间复杂度: O(1).
     */

    // 【执行用时：1ms, 在所有 Java 提交中击败了 89.99% 的用户】
    public int singleNumber(int[] nums) {
        /*
            例如(只列8位数)
            0: 00000000
            0: 00000000
            0: 00000000
            5: 00000101
            5: 00000101
            5: 00000101
            3: 00000011
            3: 00000011
            3: 00000011
            1: 00000001 (目标数)
            计算每位二进制的和，可以得到: 0、0、0、0、0、3、3、7
            对 3 取余得: 00000001，即为目标数.
         */
        int ans = 0;
        for(int i=0;i<32;i++){
            int total = 0;
            for (int num : nums) {
                total += (num>>i)&1;
            }
            if(total % 3 != 0){
                ans |= (1<<i); // 将第 i 位置为 1.
            }
        }
        return ans;
    }


}
