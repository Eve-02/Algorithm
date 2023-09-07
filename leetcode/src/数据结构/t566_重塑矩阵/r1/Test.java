package 数据结构.t566_重塑矩阵.r1;



public class Test {

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2},{3,4}};
        int[][] ints = new Solution().matrixReshape(mat, 1, 4);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
