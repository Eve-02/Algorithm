package 数组结构.t121_买股票的最佳时机.i1_双重for循环;

// https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
public class Solution {

    /**
     *
     * 时间复杂度: O(N^2)。其中 N 为数组 prices 的长度。
     *
     */

    public int maxProfit(int[] prices) {
        int profit = 0;
        // [7,1,5,3,6,4]
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if((prices[j] - prices[i]) > profit){
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }


}
