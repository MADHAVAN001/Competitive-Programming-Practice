public class Solution {
    public int numSquares(int n) {
        if(n<=0)
		return 0;
	int[] numSquares = new int[n+1];
	numSquares[0] = 0;
	numSquares[1] = 1;
	for(int i = 2;i<=n;i++)
	{
	int min = 9999;
	for(int j = 1;j<=(int)Math.floor(Math.pow(i,1/2));j++)
		min = Math.min(min, 1+numSquares[i-(int)Math.pow(j,2)]);
	numSquares[i] = min;
	}
    }
}
