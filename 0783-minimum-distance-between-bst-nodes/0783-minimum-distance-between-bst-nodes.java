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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorderTraversal(root, list);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <list.size();i++)
        {
            //System.out.println(list.get(i));
            min = Math.min(min,list.get(i)-list.get(i-1));
        }
        return min;
    }
    public void inorderTraversal(TreeNode root, List<Integer> list)
    {
        if(root == null)
            return;
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }
}