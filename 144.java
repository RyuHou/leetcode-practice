class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> nodeStack= new Stack<>();
        List<Integer> ret= new ArrayList<>();
        if(root!=null) nodeStack.push(root);
        while(!nodeStack.isEmpty()) {
            TreeNode tmp=nodeStack.pop();
            ret.add(tmp.val);
            if(tmp.right!=null)
             nodeStack.push(tmp.right);
            if(tmp.left!=null)
            nodeStack.push(tmp.left);
        }   
        return ret;        
    }
}