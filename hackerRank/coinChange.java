import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int sum;
		sum = sc.nextInt();
		int n;
		n = sc.nextInt();
		int coins[] = new int[n];
		for(int i = 0;i<n;i++)
			coins[i] = sc.nextInt();
		long dp[] = new long[sum+1];
		dp[0] = 0;
		for(int j = 0;j<n;j++)
			for(int i = coins[j];i<=sum;i++)
				if(i-coins[j]>0)
					dp[i] += dp[i-coins[j]];
				else
				if(i-coins[j] == 0)
					dp[i] += 1;
		System.out.println(dp[sum]);
    }
}