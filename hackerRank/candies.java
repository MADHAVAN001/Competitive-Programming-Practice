import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int n;
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
		int array[] = new int[n];
		for(int i = 0;i<n;i++)
			array[i] = sc.nextInt();
		int pointer = 1;
		int numCandies = 1;
        
		int dp[] = new int[n];
		dp[0] = 1;
        for(int i = 1;i<n;i++)
			if(array[i]>array[i-1])
				{
            pointer++;
				dp[i] = pointer;
				}
			else
			{
				pointer = 1;
				dp[i] = 1;
			}
        int dp_rev[] = new int[n];
        pointer = 1;
        dp_rev[n-1] = 1;
        for(int i = n-2;i>=0;i--)
			if(array[i+1]<array[i])
				{
                pointer++;
				dp_rev[i] = pointer;
				}
			else
			{
				pointer = 1;
				dp_rev[i] = 1;
			}
        
        numCandies = 0;
        for(int i = 0;i<n;i++)
            {
            //System.out.println(dp[i]+" "+dp_rev[i]);
            numCandies += Math.max(dp[i], dp_rev[i]);
        }
		System.out.println(""+numCandies);
    }
}