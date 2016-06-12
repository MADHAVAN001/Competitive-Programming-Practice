public class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0)
		return 0;
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	for(int i = 0;i<nums.length;i++)
		if(map.containsKey(nums[i]))
		{
			int value = map.get(nums[i]);
			map.replace(nums[i],value,value+1);
		}
		else
		{
			map.put(nums[i],1);
		}
	Iterator itr = map.entrySet().iterator();
	int result = 0;
	while(itr.hasNext())
	{
		int key = (int)((Map.Entry) itr.next()).getKey();
		if(map.get(key) > Math.floor(nums.length/2))
			result = key;
	}
	return result;
    }
}
