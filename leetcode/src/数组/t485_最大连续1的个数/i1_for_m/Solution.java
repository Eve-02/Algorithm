package 数组.t485_最大连续1的个数.i1_for_m;

// https://leetcode.cn/problems/max-consecutive-ones/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：1ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;){
            if(nums[i++] == 1){
                int temp = 1;
                while(i < nums.length && nums[i] == 1){
                    temp++;
                    i++;
                }
                if(temp > count){
                    count = temp;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,1,1,1};
        int maxConsecutiveOnes = new Solution().findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

}
