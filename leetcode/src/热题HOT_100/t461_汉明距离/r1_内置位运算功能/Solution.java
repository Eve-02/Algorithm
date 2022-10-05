package 热题HOT_100.t461_汉明距离.r1_内置位运算功能;

public class Solution {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
