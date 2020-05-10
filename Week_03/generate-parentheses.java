import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        recursion(0, 0, n, "");
        return res;
    }

    //递归
    public void recursion(int leftCount, int rightCount, int n, String s) {
        //提前返回
        if (leftCount > n || rightCount > n || rightCount > leftCount) return;
        //终止条件
        if (leftCount == n && rightCount == n) {
            res.add(s);
            return;
        }

        //进入下一层
        if (leftCount < n) {
            recursion(leftCount + 1, rightCount, n, s + "(");
        }
        if (rightCount < leftCount) {
            recursion(leftCount, rightCount + 1, n, s + ")");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}