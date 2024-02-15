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
    int cnt=0,res=0;
    public int kthSmallest(TreeNode root, int k) {
        Inorder(root,k);
        return res;
    }
    public void Inorder(TreeNode root,int k){
        if(root==null) return;
        
        Inorder(root.left,k);
        cnt++;
        if(cnt==k){
            res=root.val;
           return;
        }
        Inorder(root.right,k);
    }
}