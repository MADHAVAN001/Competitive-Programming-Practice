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
public class Pair{
public TreeNode node;
public int value;
public Pair(TreeNode node, int value)
{
this.node = node;
this.value = value;
}
}
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack stack = new Stack();
	stack.push(new Pair(root,0));
	List<Integer> list = new ArrayList<Integer>();
	while(!stack.isEmpty())
	{
	Pair pair = (Pair)stack.peek();
	if(pair.node == null)
		{
		stack.pop();
		continue;
		}
	if(pair.value == 0)
		{
		stack.push(new Pair(pair.node.left,0));
		pair.value++;
		continue;
		}
	if(pair.value == 1)
		{
		stack.push(new Pair(pair.node.right,0));
		pair.value++;
		continue;	
		}
	if(pair.value == 2)
	{
		stack.pop();
		list.add(pair.node.val);
	}
	}
	return list;
    }
}
