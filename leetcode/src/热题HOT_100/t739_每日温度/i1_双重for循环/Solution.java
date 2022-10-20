package 热题HOT_100.t739_每日温度.i1_双重for循环;

// https://leetcode.cn/problems/daily-temperatures/
public class Solution {

    /**
     * n 遍循环，最坏的情况是，每一遍都要遍历到未尾，
     * 时间复杂度: n + ... + 1 = 1/2 * (n * (n*1))，O(n^2).
     */
    // 【超出时限制】
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] answer = new int[len];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(temperatures[j] > temperatures[i]){
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }

}
