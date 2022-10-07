package 排列组合.t46_全排列.r1_深度优先搜索;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// https://leetcode.cn/problems/permutations/
public class Solution {

    // 【执行用时：1ms, 在所有 Java 提交中击败了 81.54% 的用户】
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(len == 0){ // 长度为 0 时直接返回
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>(); // 当前记录的排列
        boolean[] used = new boolean[len]; // 作为判断该数字是否被使用过，默认 false，未使用
        dfs(nums,len,0,path,used,res); // 深度搜索
        return res;
    }

    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if(depth == len){ // 到达第 depth 层
            res.add(new ArrayList<>(path)); // 复制，path 是引用
            return;
        }
        for(int i=0;i<len;i++){
            if(used[i]){ // 使用过，跳过该数字(使用 boolean[] 可以将时间复杂度缩减为 O(1).)
                continue;
            }
            path.addLast(nums[i]); // 未使用过，添加该数字
            used[i] = true; // 标记
            dfs(nums,len,depth+1,path,used,res); // 下一层
            path.removeLast(); // 回退撤回
            used[i] = false;
        }
    }

}
