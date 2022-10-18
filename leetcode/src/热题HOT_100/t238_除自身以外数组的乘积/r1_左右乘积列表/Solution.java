package 热题HOT_100.t238_除自身以外数组的乘积.r1_左右乘积列表;


// https://leetcode.cn/problems/product-of-array-except-self/
public class Solution {

    /**
     * 时间复杂度: O(N).预处理 L 和 R 数组以及最后的遍历计算都是 O(N) 的时间复杂度。
     */
    // 【执行用时：1ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        // 左右乘积列表
        int[] L = new int[len];
        int[] R = new int[len];
        // 结果
        int[] res = new int[len];

        // 计算左乘积列表
        L[0] = 1; // 0 左边没有元素，所以 L[0] = 1.
        for(int i=1;i<len;i++){
            L[i] = nums[i-1] * L[i-1];
        }

        // 计算右乘积列表
        R[len-1] = 1; // len-1 右边没有元素，所以 R[len-1] = 1.
        for(int i=len-2;i>=0;i--){
            R[i] = nums[i+1] * R[i+1];
        }

        // res[i] = L[i] * R[i]
        for(int i=0;i<len;i++){
            res[i] = L[i] * R[i];
        }

        return res;
    }

}
