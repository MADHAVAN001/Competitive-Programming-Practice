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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	 list = new ArrayList<List<Integer>>();       
	if(root == null)
		return list;
	build(root,0);
	for(int i = 1;i<list.size();i+=2)
	{
	List<Integer> tmplist = new ArrayList<Integer>();
	for(int j = list.get(i).size() - 1;j>=0;j--)
		tmplist.add(list.get(i).get(j));
	list.set(i,tmplist);
	}
	return list;
    }
	public void build(TreeNode node, int i)
	{
	if(node == null)
		return;
	if(list.size()<i+1)
		list.add(new ArrayList<Integer>());
	list.get(i).add(node.val);	
	build(node.left,++i);
	build(node.right,i);
}
}
