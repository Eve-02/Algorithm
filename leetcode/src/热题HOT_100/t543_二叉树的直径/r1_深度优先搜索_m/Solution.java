package 热题HOT_100.t543_二叉树的直径.r1_深度优先搜索_m;

public class Solution {

    /**
     * 时间复杂度: O(N).
     * 在遍历根结点的过程中，只用了一次深度优先搜索，先从尾结点开始，自下而上的每个结点都计算了
     * 左、右子树高度 和 左、和子树高度和。每个结点只被访问一次。
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    int ans;
    public int diameterOfBinaryTree(TreeNode root){
        ans = 1;
        depth(root);
        return ans - 1;
    }

    public int depth(TreeNode node){
        if(node == null){ // 空结点，返回 0
            return 0;
        }
        int L = depth(node.left); // 左子树的高度
        int R = depth(node.right); // 右子树的高度
        ans = Math.max(ans,L+R+1); // 同时，计算左、右子树深度和，并更新 ans 结果.
        return Math.max(L,R) + 1; // 该节点为根的子树的深度
    }

}
