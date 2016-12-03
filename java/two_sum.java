public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0)
		return null;
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i = 0; i<nums.length;i++)
	{
		map.put(nums[i],i);
	}
	for(int i = 0;i<nums.length;i++)
	{
		if(map.containsKey(target - nums[i]) && nums[i] != target-nums[i])
			{
				int ans[] = new int[2];
				ans[0] = i;
				ans[1] = map.get(target-i);
				return ans;
			}
	}
return null;
    }
}
