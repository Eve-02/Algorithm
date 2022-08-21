package 数组.t414_第三大的数.r3_一次遍历_m;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE,b = Long.MIN_VALUE,c = Long.MIN_VALUE;
        for (int num : nums) {
            if(num > a){
                c = b;
                b = a;
                a = num;
            }else if(a > num && num > b){
                c = b;
                b = num;
            }else if(b > num && num > c){
                c = num;
            }
        }
        return c == Long.MIN_VALUE ? (int)a : (int)c;
    }

}
