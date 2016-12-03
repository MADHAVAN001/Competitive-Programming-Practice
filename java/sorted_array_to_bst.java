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
    public TreeNode sortedArrayToBST(int[] nums) {
	if(nums == null || nums.length  == 0)
		return null;
	if(nums.length == 1)
		return new TreeNode(nums[0]);
	if(nums.length>1)
	{	
			
	int mid;
	if(nums.length%2 == 0)
		mid = nums.length/2;
	else
		mid = (nums.length+1)/2;
        TreeNode root = new TreeNode(nums[mid])
	int[] left_nums = Arrays.copyOfRange(nums,0,mid-1);
	int[] right_nums = Arrays.copyOfRange(nums,mid+1,nums.length);
	if(left_nums.length>0)	
		root.left = sortedArrayToBST(left_nums);
	else
		root.left = null;
	if(right_nums.length>0)
		root.right = sortedArrayToBST(right_nums);
	else
		root.right = null;
	return root;
}
    }
	
}
