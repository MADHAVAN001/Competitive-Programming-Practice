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
    public boolean isSymmetric(TreeNode root) {
     if(root == null)
	return true;
	   return checkSymmetry(root.left,root.right);
    }
public boolean checkSymmetry(TreeNode left, TreeNode right)
{
	if((left == null && right != null) ||(right == null && left!=null) )
		return false;
	if(left == null && right == null)
		return true;
	if(left.val != right.val)
		return false;
	return left.val == right.val && checkSymmetry(left.left,right.right) && checkSymmetry(left.right,right.left);
}
}
