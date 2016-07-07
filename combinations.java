public class Solution {
List<List<Integer>> result;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<List<Integer>>();
	if(k <=0 || n<=0)
	{
	result.add(new ArrayList<Integer>());
	return result;
	}
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i = 1;i<=n;i++)
	{
		list.add(i);
	}
	ArrayList<Integer> subSolution = new ArrayList<Integer>();
	dfs(list,subSolution, k,0);
	return result;
    }
public void dfs(List<Integer> list, List<Integer> solution, int k, int start)
	{
		List<Integer> tmpSolution = new ArrayList<Integer>(solution);
		if(k == 0)
	    {
			result.add(tmpSolution);
		    return;
	    }
	for(int i = start;i<list.size();i++)
	{
		
		tmpSolution.add(list.get(i));
		dfs((ArrayList)list,tmpSolution,k-1,i+1);
		tmpSolution.remove(tmpSolution.size()-1);
	}	
			
	}
}
