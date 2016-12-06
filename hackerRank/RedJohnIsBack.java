import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		int n = sc.nextInt();
		int dp[] = new int[Math.max(n+1, 5)];
		for(int i = 0;i<4;i++)
			dp[i] = 1;
		for(int i = 4;i<=n;i++)
			dp[i] = dp[i-1]+dp[i-4];
		
        System.out.println(calculatePrimes(dp[n]));
		}
    }
	public static int calculatePrimes(int n)
	{
	boolean isComposite[] = new boolean[Math.max(n+1,2)];
	isComposite[0] = true;
	isComposite[1] = true;
	for(int i = 2;i<=Math.sqrt(n);i++)
		if(!isComposite[i])
		{
		for(int j = 2*i;j<=n;j+=i)
			isComposite[j] = true;
		}
	int count = 0;
	for(int i = 0;i<=n;i++)
		if(!isComposite[i])
			count++;
	return count;
	}
}