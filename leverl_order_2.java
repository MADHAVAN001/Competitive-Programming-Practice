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
List<List<Integer>> list;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
		return null;
	list = new ArrayList<List<Integer>>();
	build(root,0);
	List<List<Integer>> reverse_order = new ArrayList<List<Integer>>();
	for(int i = list.size()-1;i>=0;i--)
		reverse_order.add(list.get(i));
	return reverse_order;
    }
	public void build(TreeNode root, int i)
	{
	if(root == null)
		return ;
	if(list.size()<i+1)
		list.add(new ArrayList<Integer>());
	build(root.left,++i);
	build(root.right,i);
	i--;
	list.get(i).add(root.val);
	}
}
