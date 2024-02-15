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
    public int maxPathSum(TreeNode root) {
        int maxValue[]=new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        maxPath(root,maxValue);
        return maxValue[0];
    }
    public int maxPath(TreeNode root,int max[]){
        if(root==null) return 0;
        
        int left=Math.max(0,maxPath(root.left,max));
        int right=Math.max(0,maxPath(root.right,max));
        
        max[0]=Math.max(max[0],root.val+left+right);
        
        return root.val+Math.max(right,left);
    }
}