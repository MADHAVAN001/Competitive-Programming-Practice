public class Solution {
    public int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0)
		return -1;
	int result = -1;
	for(int i = 0;i<nums.length;i++)
		for(int j = i+1;j<nums.length;j++)
			if(nums[i] == nums[j])
				result =  nums[i];
	return result;
    }
}
