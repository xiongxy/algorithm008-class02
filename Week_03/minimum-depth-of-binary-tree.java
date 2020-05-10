/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int MIN_DEPTH = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        recursion(root, 0);
        return MIN_DEPTH;
    }

    public void recursion(TreeNode root, int depth) {
        if (root == null) {
            if (depth < MIN_DEPTH) {
                MIN_DEPTH = depth;
            }
            return;
        }
        if(root.left !=null && root.right == null){
            recursion(root.left, depth + 1);
        }
        else if (root.left ==null && root.right != null){
            recursion(root.right, depth + 1);
        }
        else{
            recursion(root.left, depth + 1);
            recursion(root.right, depth + 1);
        }
    }
}