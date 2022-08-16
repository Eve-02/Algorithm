package 数组结构.t144_二叉树的前序遍历.i1_递归;


import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/binary-tree-preorder-traversal/
public class Solution {

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
