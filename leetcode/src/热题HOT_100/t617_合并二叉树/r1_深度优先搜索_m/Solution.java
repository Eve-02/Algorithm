package 热题HOT_100.t617_合并二叉树.r1_深度优先搜索_m;


public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public TreeNode mergeTrees(TreeNode t1,TreeNode t2){
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left,t2.left);
        merged.right = mergeTrees(t1.right,t2.right);
        return merged;
    }

}
