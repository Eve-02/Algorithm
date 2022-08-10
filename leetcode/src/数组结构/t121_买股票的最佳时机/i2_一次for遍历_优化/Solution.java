package 数组结构.t121_买股票的最佳时机.i2_一次for遍历_优化;

public class Solution {


    /**
     *
     * 先假定最小值下标为 0，从下标 1 开始遍历，
     * 在每一趟中，假定当前 i 为最大值的下标，prices[i] - prices[minIndex] 与 profit 比较，profit取较大值。
     * 同时更新 minIndex([0~i]中的最小值下标，minIndex已经是 [0~i-1]中的最小值下标)，只需要比较 prices[p] 与 prices[i] 的值即可，p 取较小值下标。
     * (minIndex取较小值下标，与后面的 i 下标计算利润，以此更新最大利润值。minIndex 为最小值，若后面的值与前面的值利润大于现有 profit，则该前面的值必定大于等于(minIndex))
     *
     * 时间复杂度：O(N)。其中 N 为数组 prices 的长度。
     *
     */


    public int maxProfit(int[] prices) {
        // [7,1,5,3,6,4]
        int profit = 0;
        int minIndex = 0;
        for(int i=1;i<prices.length;i++){
            profit = Math.max(prices[i] - prices[minIndex],profit);
            minIndex = prices[i] < prices[minIndex]?i:minIndex;
        }
        return profit;
    }

}
