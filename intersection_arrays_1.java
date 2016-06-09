public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
	        
	if(nums1 == null || nums2 == null)
		return null;
	int size_array = nums1.length<nums2.length?nums1.length:nums2.length;
	int[] result = {};	
	if(nums1.length == 0 || nums2. length == 0)
		return result;
	HashSet<Integer> set1 = new HashSet();
	HashSet<Integer> set2 = new HashSet();
	for(int i = 0;i<nums1.length;i++)
		set1.add(nums1[i]);
	for(int i = 0;i<nums2.length;i++)
		set2.add(nums2[i]);
	HashSet<Integer> set3 = new HashSet();
	Iterator itr = set2.iterator();
	while(itr.hasNext())
	{
	Integer num = (Integer)itr.next();
	if(set1.contains(num) && !set3.contains(num))
		set3.add(num);
	}
	result = new int[set3.size()];
	Iterator itr1 = set3.iterator();
	int j = 0;
	while(itr1.hasNext())
	{
	Integer num = (Integer)itr1.next();
	result[j++] = num;
 	}
	return result;
    }
}
