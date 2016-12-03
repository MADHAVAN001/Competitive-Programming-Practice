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
List<String> list;
    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<String>();
	if(root == null)
		return list;
	build(root,"");
	return list;
    }
public void build(TreeNode node, String s)
	{
	if(node == null)
		return;
	if(node.left == null && node.right == null)
		{
		list.add(s+node.val);
		return;
		}
	else
	{
		s+=s+node.val+"->";
		build(node.left,s);
		build(node.right,s);
	}
	}
}
