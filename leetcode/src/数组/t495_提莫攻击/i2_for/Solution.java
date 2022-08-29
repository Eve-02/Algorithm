package 数组.t495_提莫攻击.i2_for;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 74.15% 的用户】
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0,k = 0;
        for (int time : timeSeries) {
            if (time >= k) { // 这个数超出上个数的中毒时间范围
                res += duration;
            } else { // 这个数在上个数的中毒时间范围，如 [1,2,5] 2 中的 [1,2] => 1~3,2~4:应加上4-3=1
                res += time + duration - k;
            }
            k = time + duration; // 更新中毒持续时间
        }
        return res;
    }

    public static void main(String[] args) {
        int[] timeSeries = {1,4};
        int duration = 2;
        int poisonedDuration = new Solution().findPoisonedDuration(timeSeries, duration);
        System.out.println(poisonedDuration);

    }

}
