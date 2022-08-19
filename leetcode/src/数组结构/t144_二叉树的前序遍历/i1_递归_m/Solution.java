package 数组结构.t144_二叉树的前序遍历.i1_递归_m;


import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/binary-tree-preorder-traversal/
public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            list.add(root.val);
        }else{
            return list; /* 返回到上一层/结束当前层 */
        }
        if(root.left != null){
            preorderTraversal(root.left);
        }
        if(root.right != null){
            preorderTraversal(root.right);
        }
        return list;
    }

}
