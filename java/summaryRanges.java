public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.size() == 0)
		return null;
	List<String> result = new ArrayList<String>();
	int start = 0, end = 0;	
	for(int i = 0;i<nums.length;i++)
	{
	if(i+1<nums.length && (nums[i+1] == nums[i] +1))
		end = i+1;
	else
	if(i+1<nums.length)
	{
		if(start != end)
		result.add(nums[start] + "->" + nums[end]);
		else
		result.add(nums[start])
		start = i+1;
		end = i+1
	}
	else
	{
		if(start == end)		
		result.add(nums[start]);
		else
		result.add(nums[start] + "->" + nums[end]);
	}
	}
	return result;
    }
}
