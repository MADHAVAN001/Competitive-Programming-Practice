/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
List<Integer> list;
int itr = 0;
    public BSTIterator(TreeNode root) {
        list = new ArrayList<Integer>();
	inorder(root);
    }

	public void inorder(TreeNode root)
	{
	if(root == null)
		return;
	inorder(root.left);
	list.add(root.val);
	inorder(root.right);
	}
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(itr<list.size())
		return true;
	return false;
    }

    /** @return the next smallest number */
    public int next() {
        int result = list.get(itr);
        itr++;
	return result;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
