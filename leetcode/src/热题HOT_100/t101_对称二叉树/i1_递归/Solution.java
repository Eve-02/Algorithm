package 热题HOT_100.t101_对称二叉树.i1_递归;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/symmetric-tree/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：1ms, 在所有 Java 提交中击败了 21.27% 的用户】
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if(root.left != null){
            leftOrder(root.left,list1);
        }
        if(root.right != null){
            rightOrder(root.right,list2);
        }
        return list1.equals(list2);
    }

    public void leftOrder(TreeNode node,List<Integer> list){
        list.add(node.val);
        if(node.left != null){
            leftOrder(node.left,list);
        }else{
            list.add(null);
        }
        if(node.right != null){
            leftOrder(node.right,list);
        }else{
            list.add(null);
        }
    }

    public void rightOrder(TreeNode node,List<Integer> list){
        list.add(node.val);
        if(node.right != null){
            rightOrder(node.right,list);
        }else{
            list.add(null);
        }
        if(node.left != null){
            rightOrder(node.left,list);
        }else{
            list.add(null);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode node1 = new TreeNode(2);
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(4);
        root.left = node1;

        TreeNode node2 = new TreeNode(2);
        node2.left = new TreeNode(4);
        node2.right = new TreeNode(3);
        root.right = node2;

        System.out.println(new Solution().isSymmetric(root));
    }


}
