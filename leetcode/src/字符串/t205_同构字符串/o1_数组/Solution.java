package 字符串.t205_同构字符串.o1_数组;


public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    public boolean isIsomorphic(String s,String t){
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int[] preIndexOfs = new int[256]; // 存放 s 中的字符第一次出现的下标
        int[] preIndexOft = new int[256]; // 存放 t 中的字符第一次出现的下标
        for(int i=0;i<chars.length;i++){
            if(preIndexOfs[chars[i]] != preIndexOft[chart[i]]){ // 一对一的字符，它们第一次出现的下标肯定是相等的
                return false;
            }
            preIndexOfs[chars[i]] = i+1; // 当前下标+1，因为 int[] 数组的默认值为 0
            preIndexOft[chart[i]] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abb";
        String t = "baa";

    }

}
