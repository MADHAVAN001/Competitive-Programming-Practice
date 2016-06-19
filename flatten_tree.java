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
	TreeNode result = null, node = null;
    public void flatten(TreeNode root) {
	if(root == null)
		return;
	if(result == null)
	{
	result = root;
	node = root;
	}else
	{
	node.right = root;
	node.left = null;
	node = node.right;
	}
	flatten(root.left);
	flatten(root.right);
	root = result;
    }
}
