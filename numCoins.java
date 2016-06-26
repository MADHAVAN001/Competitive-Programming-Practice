public class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length == 0 || amount == 0)
		return 0;
	int[] numCoins = new int[amount+1];
	numCoins[0] = 0;
	int max = 99999;
	for(int i = 1;i<=amount;i++)
	{
	int value = max;
	int min = -1;
	for(int j =  0;j<coins.length;j++)
	{
		if(i>=coins[j] && numCoins[i-coins[j]]!= min && numCoins[i-coins[j]] + 1 < value)
		{
		value = numCoins[i-coins[j]] +1;
		}
	}
	if(value == max)
		numCoins[i] = -1;
	else
		numCoins[i] = value;
	}
	return numCoins[amount];
    }
}
