public class Solution {
    public int removeDuplicates(int[] nums) {
	if(nums == null || nums.length == 0)
		return 0;        
	int length = nums.length, length1 = nums.length;
	for(int i = 1;i<length;i++)
	{
		if(nums[i] == nums[i-1] && i<length1)
			{
			for(int j = i;j<length-1;j++)
				nums[j] = nums[j+1];
			length1--;
			i--;
			}
	}
	return length1;
    }
}
