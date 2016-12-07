import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		long n = sc.nextLong();
		long array[] = new int[n];
		for(long i = 0;i<n;i++)
			array[i] = sc.nextLong();
		long dp[][] = new long[n][n];
		for(long i = 0;i<n;i++)
			for(long j = i;j<n;j++)
				if(i<j)
					dp[i][j] = dp[i][j-1]^array[j];
				else if(i == j)
					dp[i][j] = array[j];
		long solution;
		for(int i = 0;i<n;i++)
			for(int j = 0;j<n;j++)
				solution = solution^dp[i][j];
		System.out.println(solution);
		}
    }
}