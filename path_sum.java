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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        list = new ArrayList<List<Integer>>();
	if(root == null)
		return list;
	build(root,new ArrayList(),sum);
	return list;
    }
	public void build(TreeNode node, List<Integer> sublist, int sum)
	{
	if(node == null)
		return;
	if(node.left == null && node.right == null && sum == node.val)
	{
	sublist.add(node.val);
	list.add(new ArrayList(sublist));
	sublist.remove(sublist.size()-1);
	}
	else
	{
	sublist.add(node.val);
	build(node.left,sublist,sum-node.val);
	build(node.right,sublist,sum-node.val);
	sublist.remove(sublist.size()-1);
	}
	}
}
