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
    List<Integer> list=new ArrayList<>();
    int maxLevel=0;
    public List<Integer> rightSideView(TreeNode root) {
      // List<Integer> list=new ArrayList<>();
		right(root,1);
		return list;
    }
    public void right(TreeNode root,int level){
       if(root==null) return;
	    if(maxLevel<level){
	        list.add(root.val);
	        maxLevel=level;
	    }
	    right(root.right,level+1);
	    right(root.left,level+1);
    }  
}