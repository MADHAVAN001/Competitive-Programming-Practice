public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0)
		return null;
	Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	for(int i = 0;i<nums.length; i++)
	{
		if(!map.containsKey(nums[i]))
		{
		map.add(nums[i],1);
		}
		else
		{
		int value = map.get(nums[i]);
		map.replace(nums[i],value,value+1);
		}
	}
    }
}
