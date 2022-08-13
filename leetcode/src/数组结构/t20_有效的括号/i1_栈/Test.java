package 数组结构.t20_有效的括号.i1_栈;

public class Test {

    public static void main(String[] args) {
        String str1 = "((([]{})))";
        String str2 = "([))[]";
        Solution solution = new Solution();
        System.out.println(solution.isValid(str1));
        System.out.println(solution.isValid(str2));
    }

}
