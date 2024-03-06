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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        TreeSet<Integer> tree=new TreeSet<>();
        addition(root,tree);
        List<List<Integer>> output=new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            List<Integer> temp=new ArrayList<>();
           Integer a=tree.floor(queries.get(i));
            Integer b=tree.ceiling(queries.get(i));
            if(a==null){
                temp.add(-1);
            }else{
                temp.add(a);
            }
            if(b==null){
                temp.add(-1);
            }else{
                temp.add(b);
            }
            output.add(temp);
        }
        return output;
    }
    public void addition(TreeNode root,Set<Integer> tree){
        if(root==null){
            return;
        }
        tree.add(root.val);
        addition(root.left,tree);
        addition(root.right,tree);
    }
}