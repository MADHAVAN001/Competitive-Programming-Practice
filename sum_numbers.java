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
List<Integer> list;
    public int sumNumbers(TreeNode root) {
        if(root == null)
		return 0;
	list = new ArrayList<Integer>();
	build(root,0);
	int sum = 0;
	for(int i = 0;i<list.size();i++)
		sum+=list.get(i);
	return sum;
	}
	public void build(TreeNode node, int n)
	{
	if(node == null)
		return;
	if(node.left == null && node.right == null)
		list.add(n*10+node.val);
	else
	{
	n = n*10+node.val;
	build(node.left,n);
	build(node.right,n);
	}
	}
}
