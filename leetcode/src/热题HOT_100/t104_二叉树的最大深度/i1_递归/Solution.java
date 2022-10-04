package 热题HOT_100.t104_二叉树的最大深度.i1_递归;

// https://leetcode.cn/problems/maximum-depth-of-binary-tree/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    int max = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        search(root,0);
        return max;
    }

    public void search(TreeNode node,int count){
        max = Math.max(++count,max);
        if(node.left != null){
            search(node.left,count);
        }
        if(node.right != null){
            search(node.right,count);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(new Solution().maxDepth(root));
    }

}
