public class Solution {
List<List<Integer>> result;
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(k<1 || n<1)
		return new ArrayList<List<Integer>>();
	result = new ArrayList<List<Integer>>();
	ArrayList<Integer> list = new ArrayList<Integer>();
	dfs(k,n,1,list);
	return result;
    }
	public void dfs(int k, int num,int start, List<Integer> list)
	{
	    
	    List<Integer> tmplist = new ArrayList<Integer>(list);
		if(start == 10)
			return;
		if(k == 0 && num == 0)
		{
			result.add(tmplist);
			return;
		}
			if(k <= 0)
			    return;
		for(int i = start;i<=9;i++)
		{
			if(num-i <0)
				break;
			list.add(i);
			dfs(k-1,num-i,i+1,list);
			list.remove(list.size()-1);
		}
	}
}
