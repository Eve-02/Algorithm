package 数学.t2240_买钢笔和铅笔的方案数.i1_枚举;

public class Solution {

    // 【执行用时：1ms, 击败 22.75% 使用 Java 的用户】
    public static long waysToBuyPensPencils(long total, long cost1, long cost2) {
        long k = 0;
        long n = total/cost1;
        for(long i=0;i<=n;i++){
            long total1 = total - i*cost1;
            long m = total1/cost2;
            k += m == 0 ? 1 : m+1;
        }
        return k;
    }

}
