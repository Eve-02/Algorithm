package 位运算.t260_只出现一次的数字3.i1_哈希表;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.cn/problems/single-number-iii/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：6ms, 在所有 Java 提交中击败了 20.29% 的用户】
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int i=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                arr[i++] = entry.getKey();
            }
        }
        return arr;
    }

}
