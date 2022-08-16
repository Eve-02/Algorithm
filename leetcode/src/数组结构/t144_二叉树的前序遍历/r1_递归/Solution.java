package 数组结构.t144_二叉树的前序遍历.r1_递归;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/binary-tree-inorder-traversal/
public class Solution {

    /**
     * 时间复杂度: O(N).每个节点都被访问一次.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

    public void preorder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }

}
