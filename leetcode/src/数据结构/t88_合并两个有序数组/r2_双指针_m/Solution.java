package 数据结构.t88_合并两个有序数组.r2_双指针_m;


public class Solution {

    /**
     * 方法一没有利用数组 nums1 与 nums2 已经被排序的性质。
     * 为了利用这一性质，我们可以使用双指针方法。这一方法将两个数组看作队列，
     * 每次从两个数组头部取出比较小的数字放到结果中;
     *
     * nums1{1,2,3,7,0,0,0}、nums2{2,5,6}
     * p1 -> nums1，p2 -> nums2
     * 初始 p1=p2=0，有4种情况：
     * 1. p1 == m 且 p2 == n。指针 p1、p2 到尾部，结束循环。
     * 2. p1 == m 但 p2 < n。指针 p1 到尾部，指针 p2 没有，cur 取 p2 对应的值，p2后移(p2++)。
     * 3. p1 < m 但 p2 == n。指针 p2 到尾部，指针 p1 没有，cur 取 p1 对应的值，p1后移(p1++)。
     * 4. p1 < m 且 p2 < n。指针 p1、p2 都没有到达尾部。此时 cur 取两者较小值，较小的值的指针后移。
     * 取完值后，将值存入下标 p1+p2-1。
     *
     * 时间复杂度：O(m+n)。指针移动单调递增，最多移动 m+n 次
     *
     */
    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0,p2 = 0;
        int[] sorted = new int[m+n];
        int cur;
        while(p1<m || p2<n){
            if(p1 == m){
                cur = nums2[p2++];
            }else if(p2 == n){
                cur = nums1[p1++];
            }else if(nums1[p1] < nums2[p2]){
                cur = nums1[p1++];
            }else{
                cur = nums2[p2++];
            }
            sorted[p1+p2-1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }

}
