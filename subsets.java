public class Solution {
List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
	result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
		return result;
	for(int i = 0;i<=nums.length;i++)
		dfs(nums, new ArrayList<Integer>(), 0, i);
	return result;
    }
public void dfs(int[] nums, List<Integer> list, int pointer, int size)
{
List<Integer> tmpList = new ArrayList<Integer>(list);
if(size == 0)
	{
	result.add(tmpList);
	return;
	}
for(int i = pointer;i<nums.length; i++)
{
tmpList.add(nums[i]);
dfs(nums,tmpList,i+1,size-1);
tmpList.remove(tmpList.size()-1);
}
}

}
