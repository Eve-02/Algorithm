package 字符串.t205_同构字符串.o2_IndexOf;

public class Solution {

    /**
     * indexOf() 就已经存放了该字符第一次映射关系的下标
     */
    // 【执行用时：10ms, 在所有 Java 提交中击败了 78.56% 的用户】
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            //取当前位置字符第一次出现的索引对比
            //情况1(一个字符映射多个): foo 与 bar, 处理第二个o时发现索引不同
            //情况2(多个字符映射同个): abc 与 ggl, 处理第二个g时发现索引不同
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
