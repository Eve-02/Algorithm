package 数组结构.t94_二叉树的中序遍历.i1_递归;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/binary-tree-inorder-traversal/
public class Solution {

    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }


}
