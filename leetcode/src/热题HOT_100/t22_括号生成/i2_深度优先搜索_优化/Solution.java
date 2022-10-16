package 热题HOT_100.t22_括号生成.i2_深度优先搜索_优化;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     *  省去栈，可以用一个变量 int k 代替栈，k 表示当前(栈中)左括号的数量。
     */
    public List<String> generateParenthesis(int n) {
        int[] arr = new int[2]; // arr[0] 表示左括号的数量，arr[1] 表示右括号的数量
        Arrays.fill(arr,n); // 初始填充为 n
        StringBuilder builder = new StringBuilder(); // 记录当前遍历的括号组合
        int count = 0,k = 0; // count 表示层数，k 表示遍历的左括号数量(当遇到左括号时:k++，当遇到右括号时:k--)
        dfs(arr,builder,k,count,2*n); // 遍历
        return res;
    }

    List<String> res = new ArrayList<>();
    public void dfs(int[] arr,StringBuilder builder,int k, int count,int len) {
        if(count == len){ // 到达第 2*n 层
            if(k == 0){ // k == 0 时，该括号组合有效
                res.add(builder.toString());
            }
            return;
        }
        if(arr[0] != 0){ // 判断 0(左括号) 是否还有
            builder.append('('); // 赋值
            k++;
            arr[0]--;
            dfs(arr,builder,k,count+1,len);
            builder.delete(builder.length()-1,builder.length()); // 下一层
            arr[0]++; // 撤回
            k--;
        }
        if(arr[1] != 0 && k != 0){ // 遇到右括号时，需要先判断 k 是否不为 0，当 k 为 0 时，那么该括号组合无效，退回上一层。
            builder.append(')');
            k--;
            arr[1]--;
            dfs(arr,builder,k,count+1,len);
            builder.delete(builder.length()-1,builder.length());
            arr[1]++;
            k++;
        }
    }

}
