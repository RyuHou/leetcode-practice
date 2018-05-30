class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> nodeStack= new Stack<>();
        List<Integer> ret= new ArrayList<>();
        TreeNode tmp=root;
        while(tmp!=null || !nodeStack.isEmpty()) {
            if(tmp!=null) {
            nodeStack.push(tmp);
            tmp=tmp.left;  
            } else {
                tmp = nodeStack.pop();
                ret.add(tmp.val);
                tmp=tmp.right;
            }
        }
        
        return ret;
    }
}