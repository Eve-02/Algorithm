package 热题HOT_100.t543_二叉树的直径.i1_深度优先搜索;

// https://leetcode.cn/problems/diameter-of-binary-tree/
public class Solution {

    /**
     * 遍历每一个节点的左子树深度和右子树深度之和
     * 在查找一个节点的左右高度的过程中，会重复的查找。
     */
    // 【执行用时：16ms, 在所有 Java 提交中击败了 10.13% 的用户】
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        v(root);
        return k;
    }

    int k = 0;
    public void v(TreeNode node){
        int height = search(node.left,0) + search(node.right,0);
        k = Math.max(k,height);
        if(node.left != null){
            v(node.left);
        }
        if(node.right != null){
            v(node.right);
        }
    }

    public int search(TreeNode node,int height){
        if(node == null){
            return height;
        }
        int leftHeight = search(node.left,height+1);
        int rightHeight = search(node.right,height+1);
        return Math.max(leftHeight,rightHeight);
    }

}
