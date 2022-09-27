package 热题HOT_100.t338_比特位计数.i1;

import java.util.Arrays;

// https://leetcode.cn/problems/counting-bits/?favorite=2cktkvj
public class Solution {

    // 【执行用时：8ms, 在所有 Java 提交中击败了 9.73% 的用户】
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++){
            int count = 0;
            for(int j=0;j<32;j++){
                if((i >> j) == 0){
                    break;
                }
                if(((i >> j) & 1) == 1 ){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().countBits(5)));
    }


}
