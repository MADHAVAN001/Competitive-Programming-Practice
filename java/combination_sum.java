public class Solution {
List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	result = new ArrayList<List<Integer>>();
	if(candidates == null || candidates.length == 0)
	{
		return result;
	}
	dfs(candidates,target,0, new ArrayList<Integer>());
	return result;	        
    }
public void dfs(int[] candidates, int target,int pointer, List<Integer> list)
{
List<Integer> tmpList = new ArrayList<Integer>(list);
if(target == 0)
	{
		result.add(tmpList);
		return;
	}
if(target<0)
	return;
for(int i = pointer;i<candidates.length;i++)
{
tmpList.add(candidates[i]);
dfs(candidates,target-candidates[i],i,tmpList);
tmpList.remove(tmpList.size()-1);
}
}
}
