public class Solution {
    public int[] plusOne(int[] digits) {
	if(digits.length == 0 || digits == null)
		return digits;
	int carry = 0;        
	for(int i = digits.length-1;i>=0;i--)
	{
	if(i == digits.length-1)
		{
		if(digits[i] == 9)
		{		
			digits[i] = 0;
			carry == 1;
		}
		else
			digits[i]++;
		}
	else
	if(carry == 1)
	{
	if(digits[i] == 9)
	{
		digits[i] = 0;
		carry = 1;
	}
	else
	{
		digits[i]++;
		carry = 0;
	}
	}
	}
	if(carry == 1)
	{
		int result = new int[digits.length+1];
		result[0] = 1;
		for(int i = 0;i<digits.length;i++)
		result[i+1] = digits[i]; 
		return result;
	}
	return digits;
    }
}
