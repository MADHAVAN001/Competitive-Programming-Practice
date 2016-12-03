public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int digits = n;
	int[] nums = new int[digits+1];
	if(digits == 0)
	    return 1;
	nums[0] = 0;
	nums[1] = 10;
	for(int i = 2;i<=digits;i++)
	{
	    if(i <=11)
	       {
		nums[i] = 9;
		for(int j = 1;j<i;j++)
		{
			nums[i] = nums[i] * (10-j);
		}
		nums[i] = nums[i] + nums[i-1];
	       }
	       else
	       nums[i] = nums[i-1];
	}
	return nums[digits];
    }
}
