import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		while(n-->0)
		{
		int k;
		k = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<k;i++)
			list.add(sc.nextInt());
		int dp[][] = new int[k][k];
		int max = -99999;
		for(int i = 0;i<k;i++)
			for(int j = i;j<k;j++)
				if(i<j)
					{
					dp[i][j] = dp[i][j-1]+list.get(j);
					max = Math.max(max,dp[i][j]);
					}
					else
				if(i == j)
				{
					dp[i][j] = list.get(i);
					max = Math.max(max,dp[i][j]);
				}
		int nonContg = 0;
		int maxElement = -99999;
		for(int i = 0;i<k;i++)
			{
			if(list.get(i)>0)
				nonContg += list.get(i);
			maxElement = Math.max(list.get(i), maxElement);
			}			
		System.out.print(max+" ");
		if(nonContg == 0)
			System.out.println(maxElement);
		else
			System.out.println(nonContg);
		}
    }
}