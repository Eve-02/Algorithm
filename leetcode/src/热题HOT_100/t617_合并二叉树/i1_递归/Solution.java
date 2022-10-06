package 热题HOT_100.t617_合并二叉树.i1_递归;

// https://leetcode.cn/problems/merge-two-binary-trees/
public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        TreeNode root = new TreeNode();
        merge(root,root1,root2);
        return root;
    }

    public void merge(TreeNode node,TreeNode node1,TreeNode node2){
        int val1 = node1 == null ?  0 : node1.val; // 取 root1 中 node1 的值(node1可能为空)
        int val2 = node2 == null ?  0 : node2.val; // 取 root2 中 node2 的值(node2可能为空)
        node.val = val1 + val2; // 合并(即赋值)
        if((node1 != null && node1.left != null) || (node2!= null && node2.left != null)){ // 当 node1 的左子树不为空，并且 node2 的右子树不为空时才往下合并
            node.left = new TreeNode(); // 创建对应的节点
            TreeNode n1 = node1 == null ? null : node1.left; // 取出节点(考虑到 node1 可能为空，要取 node1.left 的话这样方便点)
            TreeNode n2 = node2 == null ? null : node2.left;
            merge(node.left,n1,n2); // 进行合并
        }
        if((node1 != null && node1.right != null) || (node2!= null && node2.right != null)){ // 下面合并右子树同理
            node.right = new TreeNode();
            TreeNode n1 = node1 == null ? null : node1.right;
            TreeNode n2 = node2 == null ? null : node2.right;
            merge(node.right,n1,n2);
        }
    }

}
