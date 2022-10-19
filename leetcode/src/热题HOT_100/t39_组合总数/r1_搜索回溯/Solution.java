package 热题HOT_100.t39_组合总数.r1_搜索回溯;


import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/combination-sum/
public class Solution {

    // 【执行用时：1ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs(candidates,target,ans,combine,0);
        return ans;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int count) {
        if(count == candidates.length){ // 当不满足时，count 会进入下一层，此时 target 也为负数。
            return;
        }
        if(target == 0){ // 满足条件，复制 ArrayList 结果
            ans.add(new ArrayList<>(combine));
            return;
        }
        // 不选择当前数
        dfs(candidates,target,ans,combine,count+1);
        // 选择当前数, 下一进入下一层仍是搜索当前数
        if(target - candidates[count] >= 0){
            combine.add(candidates[count]);
            dfs(candidates,target - candidates[count],ans,combine,count);
            combine.remove(combine.size()-1); // 返回一层，要将此选择的数移除进入其它路径搜索
        }
    }


}
