package 数组结构.t88_合并两个有序数组.r3_逆向双指针_m;

public class Solution {

    /**
     * 方法二中，之所以要使用临时变量，是因为如果直接合并到数组 nums1 中，nums1 中的元素可能会在取出之前被覆盖。
     * 那么如何直接避免覆盖 nums1 中的元素呢？
     * 观察可知，nums1 的后半部分是空的，可以直接覆盖而不会影响结果。
     * 因此可以指针设置为从后向前遍历，每次取两者之中的较大者放进 nums1 的最后面。
     *
     * 时间复杂度：O(m+n)。指针移动单调递增，最多移动 m+n 次
     * 空间复杂度：O(1)。不需要额外的空间，直接在 nums1 上修改.
     *
     */
    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int p1 = m-1,p2 = n-1; // 指向尾部
        int tail = m+n-1; // nums1尾部,每存一个值就前移
        int cur;
        while(p1>=0 || p2>=0){
            if(p1 == -1){
                cur = nums2[p2--];
            }else if(p2 == -1){
                cur = nums1[p1--];
            }else if(nums1[p1] > nums2[p2]){
                cur = nums1[p1--];
            }else{
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }

}
