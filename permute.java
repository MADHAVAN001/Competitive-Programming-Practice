public class Solution {
List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
        {
		result.add(new ArrayList<Integer>());
	    return result;
        }
	List<Integer> list = new ArrayList<Integer>();
	List<Integer> numbers = new ArrayList<Integer>(); 
	for(int i = 0;i<nums.length;i++)
		numbers.add(nums[i]);
	dfs(numbers,list);
	return result;
    }
public void dfs(List<Integer> numbers, List<Integer> list)
	{
	List<Integer> tmpList = new ArrayList<Integer> (list);
	if(numbers.size() == 0)
	{
		result.add(tmpList);
		return;
	}
	for(int i = 0;i<numbers.size();i++)
	{
	List<Integer> innerNumbers = new ArrayList<Integer>(numbers);
	tmpList.add(numbers.get(i));
	innerNumbers.remove(i);
	dfs(innerNumbers, tmpList);
	tmpList.remove(tmpList.size()-1);
	}	
	}
}
