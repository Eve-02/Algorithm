package 热题HOT_100.t226_翻转二叉树.i1_递归;

// https://leetcode.cn/problems/invert-binary-tree/
public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        invert(root);
        return root;
    }

    public void invert(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        if(node.left != null){
            invert(node.left);
        }
        if(node.right != null){
            invert(node.right);
        }
    }


}
