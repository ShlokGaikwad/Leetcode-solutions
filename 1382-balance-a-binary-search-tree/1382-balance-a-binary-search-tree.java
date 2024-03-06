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
    List<TreeNode> currentNodes = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        preOrder(root);
        return balance(0, currentNodes.size() - 1);
    }

    public TreeNode balance(int i, int j) {
        if (i > j)
            return null;

        int mid = i + (j - i) / 2;
        TreeNode res = currentNodes.get(mid);
        res.left = balance(i, mid - 1);
        res.right = balance(mid + 1, j);
        return res;
    }

    public void preOrder(TreeNode root) {
        if (root == null)
            return;

        preOrder(root.left);
        currentNodes.add(root);
        preOrder(root.right);
    }

}