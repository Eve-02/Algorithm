package 热题HOT_100.t101_对称二叉树.r1_递归_m;


public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val && check(p.left,q.right) && check(p.right,q.left);
    }

}
