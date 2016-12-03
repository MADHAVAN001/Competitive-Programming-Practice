public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
	for(int i = 0;i<=num;i++)
	{
	double value = Math.log10(num)/Math.log10(2); 
		if( value-Math.floor(value)<Math.pow(10,-10) )
			result[i] = 1;
		else
			result[i] = 1 + result[i - Math.pow(2,Math.floor(Math.log(i)/Math.log(2)))];
	}
	return result;
    }
}
