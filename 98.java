class Solution {
    public boolean isValidBST(TreeNode root) {       
        return ifValidBST(root, null, null);
    }
    
    public boolean ifValidBST(TreeNode root, Integer min_val, Integer max_val) {
        if(root==null) return true;
        
        return (min_val==null || root.val>min_val) && (max_val==null ||root.val<max_val) 
            && ifValidBST(root.left, min_val, root.val) 
            && ifValidBST(root.right,root.val,max_val);
        
    }
}