/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int MAX_DEPTH = 0;

    public int maxDepth(TreeNode root) {
        recursion(root, 1);
        return MAX_DEPTH;
    }

    public void recursion(TreeNode root, int depth) {
        if (root == null) {
            if (depth > MAX_DEPTH) {
                MAX_DEPTH = depth;
            }
            return;
        }
        recursion(root.left, depth + 1);
        recursion(root.right, depth + 1);
    }
}