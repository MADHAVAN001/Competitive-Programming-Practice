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
    public List<List<Integer>> levelOrder(TreeNode root) {
        list = new ArrayList<List<Integer>>();
	recur(root,0);
	return list;
    }
public void recur(TreeNode node, int i)
{
    if(node == null)
        return;
if(list.size() < i+1)
	list.add(i,new ArrayList<Integer>());
recur(node.left,++i);
recur(node.right,i);
i--;
list.get(i).add(node.val);
}
}
