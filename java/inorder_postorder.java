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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null ||inorder.length == 0 || postorder.length == 0 )
		return null;
	int inorderStart = 0;
	int inorderEnd = inorder.length-1;
	int postorderStart = 0;
	int postorderEnd = postorder.length-1;
	
	TreeNode root = build(inorder,postorder,inorderStart,inorderEnd,postorderStart,postorderEnd);
	return root;
    }
	public TreeNode build(int[] inorder, int[] postorder, int inorderStart,int inorderEnd,int postorderStart,int postorderEnd)
	{
	if(inorderEnd<inorderStart || postorderStart>postorderEnd)
		return null;
	TreeNode root;
	int i;
	for(i = inorderStart;i<=inorderEnd;i++)
		if(inorder[i] == postorder[postorderEnd])
			break;
	root = new TreeNode(postorder[postorderEnd]);
	root.left = build(inorder,postorder,inorderStart,i-1,postorderStart,postorderStart+ i-1-inorderStart);
	
	root.right = build(inorder,postorder,i+1 ,inorderEnd,postorderStart+ i-inorderStart,postorderEnd-1);

	return root;		
	}
}
