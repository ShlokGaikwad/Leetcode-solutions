/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Integer> ls=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        inorder(root);
        return ls;
        
        
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorderTraversal(root.left);
        ls.add(root.val);
        inorderTraversal(root.right);
        
        // return ls;
    }
}