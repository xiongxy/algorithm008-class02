class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    var currentNode = root;
    while (currentNode != null || !stack.isEmpty()) {
        while (currentNode != null) {
            stack.push(currentNode);
            currentNode = currentNode.left;
        }
         currentNode = stack.pop();
        res.add(currentNode.val);
        currentNode = currentNode.right;
    }
    return res;
}
}