public class Solution {
    public int[] searchRange(int[] nums, int target) {
	int[] result = new int[2];
	result[0] = -1;
	result[1] = -1;        
	if(nums == null || nums.length == 0)
		return result;
	int start = 0;
	int ending = nums.length - 1;
	int mid = 0;
	result[0] = -1;
	result[1] = -1;
	while(start<=ending)
	{
	mid = (start+ending)/2;
	if(nums[mid] == target &&(mid)>=1&& nums[mid-1] != target)
		result[0] = mid;
    if(nums[mid] == target && mid == 0)
        result[0] = mid;
	if(nums[mid]>=target)
		ending = mid-1;
	else
		start = mid+1;
	}
	start = 0;
	ending = nums.length-1;
	while(start<=ending)
	{
	mid = (start+ending)/2;
	if(nums[mid] == target && (mid)<=nums.length-2&&nums[mid+1] != target)
		result[1] = mid;
	if(nums[mid] == target && mid == (nums.length-1))
	    result[1] = mid;
	if(nums[mid] > target)
		ending = mid-1;
	else
		start = mid+1;
	}
	return result;
    }
}
