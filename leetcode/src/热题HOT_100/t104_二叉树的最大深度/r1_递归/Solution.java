package 热题HOT_100.t104_二叉树的最大深度.r1_递归;


public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }

}
