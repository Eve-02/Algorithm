package 热题HOT_100.t338_比特位计数.r1;


public class Solution {

    // 【执行用时：2ms, 在所有 Java 提交中击败了 39.40% 的用户】
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for(int i=0;i<=n;i++){
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x){
        int ones = 0;
        while(x > 0){
            x = x & (x-1);
            ones++;
        }
        return ones;
    }

}
