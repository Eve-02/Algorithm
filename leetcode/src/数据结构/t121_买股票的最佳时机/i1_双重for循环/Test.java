package 数据结构.t121_买股票的最佳时机.i1_双重for循环;

public class Test {

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(new Solution().maxProfit(prices));

        int[] prices1 = new int[]{7,6,4,3,1};
        System.out.println(new Solution().maxProfit(prices1));
    }

}
