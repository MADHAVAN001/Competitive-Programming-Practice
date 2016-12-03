public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
	if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
	return new int[0];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i = 0;i<nums1.length;i++)
		if(map.containsKey(nums1[i]))
			{
			int value = map.get(nums1[i]);
			map.replace(nums1[i],value,value+1);
			}
		else
			map.put(nums1[i],1);
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i = 0;i<nums2.length;i++)
		if(map.containsKey(nums2[i]) && map.get(nums2[i])>0)
		{
			int value = map.get(nums2[i]);
			map.replace(nums2[i],value,value-1);
			list.add(nums2[i]);
		}
	int[] result = new int[list.size()];	
	for(int i = 0;i<list.size();i++)
		result[i] = list.get(i);
	return result; 
    }
}
