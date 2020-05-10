class Solution {
    public int climbStairs(int n) {
        return fibonacci( n);
    }

    //暴力方法
    public int recursion(int current, int n) {
        if (current > n) {
            return 0;
        }
        if (current == n) {
            return 1;
        }
        return recursion(current + 1, n) + recursion(current + 2, n);
    }

    //斐波那契
    public int fibonacci(int n) {
        // 我们发现 爬1阶有一种方法 爬2阶有两种方法
        //发现爬第三阶等于 爬1阶+ 爬2阶,从第三阶开始，我们得到后面的数据其实类似于斐波那契，所以我们从第三阶开始使用斐波那契计算
        //我们先固化 f1 f2 , 然后找到爬3阶的规律  f3 = f1+f2 , fn = fn-1 +fn-2
        int f1 = 1;
        int f2 = 2;
        if (n == 1) return f1;
        if (n == 2) return f2;
        int fn = 0;
        for (int i = 3; i <= n;i++ ){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(50));
    }
}