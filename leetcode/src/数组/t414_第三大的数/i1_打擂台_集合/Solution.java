package 数组.t414_第三大的数.i1_打擂台_集合;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.cn/problems/third-maximum-number/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：6ms, 在所有 Java 提交中击败了 15.25% 的用户】
    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.add(num)){
                for(int i= 0;i<3;i++){
                    if(i > list.size()-1 || num > list.get(i)){
                        list.add(i,num);
                        break;
                    }
                }
                if(list.size() > 3){
                    list.remove(3);
                }
            }
        }
        return list.size() >= 3 ? list.get(list.size()-1) : list.get(0);
    }

}
