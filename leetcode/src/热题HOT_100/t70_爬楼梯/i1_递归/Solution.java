package 热题HOT_100.t70_爬楼梯.i1_递归;

// https://leetcode.cn/problems/climbing-stairs/?favorite=2cktkvj
public class Solution {

    // 【超出时间限制】
    int res = 0;
    public int climbStairs(int n) {
        search(n,0);
        return res;
    }

    public void search(int n,int count){
        if(count == n){
            res++;
            return;
        }
        if(count <  n){
            search(n,count+1);
            search(n,count+2);
        }
    }


}
