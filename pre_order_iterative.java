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
	    
public List<Integer> preorderTraversal(TreeNode root) {
	Stack st = new Stack();
	if(root!=null)
    	st.push(root);
	while(st.size()>0)
	{
		TreeNode node = (TreeNode)st.pop();
		list.add(node.val);
		if(node.right != null)
			st.push(node.right);
		if(node.left != null)		
			st.push(node.left);
	}
	return list;			       
    }
}
