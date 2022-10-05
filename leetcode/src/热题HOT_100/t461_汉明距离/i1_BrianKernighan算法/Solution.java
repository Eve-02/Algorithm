package 热题HOT_100.t461_汉明距离.i1_BrianKernighan算法;

// https://leetcode.cn/problems/hamming-distance/
public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int hammingDistance(int x, int y) {
        int k = x ^ y;
        int count = 0;
        while(k != 0){
            count++;
            k &= k - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 1,y = 4;
        System.out.println(new Solution().hammingDistance(x, y));
    }

}
