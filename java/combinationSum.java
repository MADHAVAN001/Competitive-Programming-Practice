public class Solution {
List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<List<Integer>>();
	if(candidates == null || candidates.length == 0)
		return result;
	Arrays.sort(candidates);
	dfs(candidates, new ArrayList<Integer>(), 0, target);
	return result;
    }
public void dfs(int[] nums, List<Integer> list, int pointer, int target)
{
List<Integer> tmpList = new ArrayList<Integer>(list);
if(target == 0)
	{
	result.add(tmpList);
	return;
	}
if(target<0)
	return;
for(int i = pointer;i<nums.length;i++)
{
tmpList.add(nums[i]);
dfs(nums,tmpList, i+1, target-nums[i]);
while(i<nums.length-1 && nums[i] == nums[i+1])
	i++;
tmpList.remove(tmpList.size()-1);
}
}
}
