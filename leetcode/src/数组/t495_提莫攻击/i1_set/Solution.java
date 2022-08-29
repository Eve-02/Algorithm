package 数组.t495_提莫攻击.i1_set;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/teemo-attacking/
public class Solution {

    // 超时.. 时间复杂度 O(M*N).其中 M 为 timeSeries 的长度，N 为 duration
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<timeSeries.length;i++){
            int val = timeSeries[i];
            for(int j=0;j<duration;j++){
                set.add(val++);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] timeSeries = {1,2};
        int duration = 2;
        int poisonedDuration = new Solution().findPoisonedDuration(timeSeries, duration);
        System.out.println(poisonedDuration);
    }

}
