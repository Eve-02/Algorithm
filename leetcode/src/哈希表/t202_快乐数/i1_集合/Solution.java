package 哈希表.t202_快乐数.i1_集合;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/happy-number/
public class Solution {

    Set<Integer> set = new HashSet<>();

    /**
     * 使用 set 存储每一次求和后的数，若为 1，则 true.若 为已经存在，则 false.
     * 否则进行递归下一次。
     */
    // 【执行用时：1ms, 在所有 Java 提交中击败了 79.96% 的用户】
    public boolean isHappy(int n) {
        int res = 0;
        // 求和
        while(n != 0){
            int a = (int) Math.pow(n%10,2);
            res += a;
            n /= 10;
        }
        if(res == 1){
            return true;
        }else if(!set.add(res)){
            return false;
        }else{
            return isHappy(res);
        }
    }

}
