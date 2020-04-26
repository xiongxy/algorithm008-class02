class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
           List<Integer> list = new ArrayList<>();
           if(root==null){
               return list;
           }
           Stack<TreeNode> stack = new Stack<>();
           stack.push(root);
           while (!stack.isEmpty()){
               var currentNode = stack.pop();
               list.add(currentNode.val);
               if (currentNode.right!=null){
                   stack.push(currentNode.right);
               }
               if (currentNode.left!=null){
                   stack.push(currentNode.left);
               }
           }
           return  list;
       }
   }