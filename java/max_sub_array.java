public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
		    return 0;
	int[] sum = new int[nums.length];
	int result = nums[0];
	sum[0] = nums[0];
	for(int i = 1;i<nums.length;i++)
	{
	sum[i] = Math.max(nums[i],sum[i-1]+nums[i]);
	result = Math.max(sum[i],result);
	}
	return result;
    }
}
