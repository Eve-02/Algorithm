package 数学.t2240_买钢笔和铅笔的方案数.r1_枚举;

public class Solution {

    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(cost2 > cost1){
            waysToBuyPensPencils(total, cost2, cost1); // 价格大的减少遍历次数
        }
        long res = 0, cnt = 0; // 结果用long型
        while (cnt * cost1 <= total) {
            res += (total - cnt * cost1) / cost2 + 1;
            cnt++;
        }
        return res;
    }

}
