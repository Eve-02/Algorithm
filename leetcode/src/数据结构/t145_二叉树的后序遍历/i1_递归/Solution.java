package 数据结构.t145_二叉树的后序遍历.i1_递归;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/binary-tree-postorder-traversal/
public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root,list);
        return list;
    }

    public void postorder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
        postorder(node.left,list);
        postorder(node.right,list);
        list.add(node.val);
    }

}
