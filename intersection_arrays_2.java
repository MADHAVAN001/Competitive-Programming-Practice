public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
	        
	if(nums1 == null || nums2 == null)
		return null;
	int size_array = nums1.length<nums2.length?nums1.length:nums2.length;
	int[] result = {};	
	if(nums1.length == 0 || nums2. length == 0)
		return result;
	HashSet<Integer> set1 = new HashSet();
	result = new int[];
	for(int i = 0;i<nums1.length;i++)
		set1.add(nums1[i]);
	for(int i = 0;i<nums2.length;i++)
	{
		if(set1.contains(nums2[i]))
			result.add(nums)
	}
	

	return result;
    }
}
