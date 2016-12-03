/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class max_depth {
    public int maxDepth(TreeNode root) {
	if(root == null)
		return 0;
        if(root != null)
		return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
