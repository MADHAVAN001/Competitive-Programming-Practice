import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.nextLine();
		int m = n.length();
		BigInteger num[] = new BigInteger[m];
		
		for(int i = 0;i<m;i++)
            {
            num[i] = new BigInteger(""+n.charAt(i));
        }
		BigInteger dp[][] = new BigInteger[m][m];
		BigInteger sum = BigInteger.ZERO;
		for(int i = 0;i<m;i++)
			for(int j = i;j<m;j++)
			{
				if(i<j)
					dp[i][j] = num[j].add(dp[i][j-1].multiply(new BigInteger("10")));
				else if(i == j)
					dp[i][j] = num[j];
				sum = sum.add(dp[i][j]);
			}
		System.out.println(sum.mod(new BigInteger("1000000007")));
    }
}