public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0)
		return 0;
	int start = 0, ending = nums.length-1;
	int mid;	
	while(start<=ending)
	{
	mid = (start+ending)/2;
	if(nums[mid] == target)
		return mid;
	else
	if(nums[mid]>target)
		start = mid+1;
	else
		ending = mid-1;
	}
	if(nums[mid]>=target)
		return mid;
	else
		return mid+1;
    }
}
