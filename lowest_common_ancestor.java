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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode tmp = root;
	if(tmp.val>p.val && tmp.val<q.val)
		return tmp;
	else
		if(tmp.val>q.val && tmp.val > p.val)
			return lowestCommonAncestor(root.left,p,q);
	else
		if(tmp.val<q.val && tmp.val < p.val)
			return lowestCommonAncestor(root.right,p,q);
    }
}
