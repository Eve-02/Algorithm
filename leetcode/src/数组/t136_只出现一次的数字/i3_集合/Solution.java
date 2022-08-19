package 数组.t136_只出现一次的数字.i3_集合;

import java.util.*;

public class Solution {

    // 【执行用时：570ms, 在所有 Java 提交中击败了 5.03% 的用户】
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if(list.contains(num)){
                list.remove(Integer.valueOf(num));
            }else{
                list.add(num);
            }
        }
        return list.get(0);
    }

}
