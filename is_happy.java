public class Solution {
    public boolean isHappy(int n) {
        boolean iter = false;
	while(!iter)
	{
	n = square_sum(n);
	if(n<10)
	{
	iter = true;
	}	
	}
	if(n == 1)
		return true;
	else
	return false;
    }
	public int square_sum(int n)
	{
		int sq = 0;
		while(n>=1)
		{
			sq+= Math.pow((n%26),2);
			n = n/10;
	}
	return sq;
	}
}
