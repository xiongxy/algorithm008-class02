package highdp;

/**
 * @author xxyWi
 */
public class LongestValidParentheses {
    public static void main(String[] args) {
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        longestValidParentheses.longestValidParentheses(")()())");
    }

    public int longestValidParentheses(String s) {
        if(s.length() == 0){
            return 0;
        }
        //dp定义 其中第i个元素 代表在i这个元素这结尾的最长有效长度是多少
        int[] dp = new int[s.length()];
        //初始化
        dp[0] = 0;
        //状态表达式
        int maxVal = 0;
        for (int i = 1; i < s.length() ; i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    if (i >= 2) {
                        dp[i] = dp[i - 2] + 2;
                    } else {
                        dp[i] = 2;
                    }
                } else if (dp[i - 1] > 0) {
                    if ((i - dp[i - 1] - 1) >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        dp[i] = dp[i - 1] + 2;
                        if ((i - dp[i - 1] - 2) >= 0) {
                            dp[i] = dp[i] + dp[i - dp[i - 1] - 2];
                        }
                    }
                }
            }
            maxVal = Math.max(maxVal, dp[i]);
        }
        return maxVal;
    }
}
