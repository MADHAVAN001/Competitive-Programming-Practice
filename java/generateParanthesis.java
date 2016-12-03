public class Solution {
List<String> result;
    public List<String> generateParenthesis(int n) {
	result = new ArrayList<String>();
	if(n<0)
	    return result;
	if(n<1)
	    {
	        result.add("");
		return result;
	    }
	dfs(n,n,"");
	return result;
    }

	public void dfs(int left, int right, String s)
	{
		if(left>right)
			return;
		if(left == 0 && right == 0)
		{
		result.add(s);
		return;
		}
		if(left>0)
		{
		dfs(left-1,right,s+"(");
		}
		if(right>0)
			dfs(left,right-1,s+")");
	}
}
