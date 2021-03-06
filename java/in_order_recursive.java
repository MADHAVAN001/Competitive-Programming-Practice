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
List<Integer> list = new ArrayList<Integer>();
	    
public List<Integer> inorderTraversal(TreeNode root) {
	if(root == null)
		return list;
	
	inorderTraversal(root.left);
	list.add(root.val);	
	inorderTraversal(root.right);
	return list;			       
    }
}
