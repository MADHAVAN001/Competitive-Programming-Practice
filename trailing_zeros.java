public class Solution {
    public int trailingZeroes(int n) {
	int nums_five = 0;        
	int num = (int)Math.floor(Math.log(i)/Math.log(5));
	for(int i = 1; i<num;i++)
		nums_five += Math.floor(n/Math.pow(5,num));

	return nums_five;
    }
}
