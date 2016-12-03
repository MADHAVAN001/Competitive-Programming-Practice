/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
	if(root == null)
		return null;
	
        TreeNode invertedRoot = new TreeNode(root.x);
	invertedRoot.left = invertTree(root.right);
	invertedRoot.right = invertTree(root.left);
	return invertedRoot;
    }
}
