public class Solution {
    public String countAndSay(int n) {
        if(n<=0)
		return "1";
	String ans = "1";
	for(int j = 1;j<n;j++)
	{
	int num = 1;	
	String value = "";
	for(int i = 0;i<ans.length()-1;i++)
		if(ans.charAt(i) == ans.charAt(i+1))
			num++;
		else
		{
			 
			value += num;
			value += ans.charAt(i);
			num = 1;
		}
	value += num;
	value += ans.charAt(ans.length()-1);
	
	ans = value;
	}
	return ans;
    }
}
