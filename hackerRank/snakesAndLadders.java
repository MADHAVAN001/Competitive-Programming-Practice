import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			Map<Integer,Integer> snakeMap = new HashMap<Integer, Integer>();
			Map<Integer, Integer> ladderMap = new HashMap<Integer, Integer>();
			for(int i = 0;i<n;i++)
				ladderMap.put(sc.nextInt(),sc.nextInt());
			int m = sc.nextInt();
			for(int i = 0;i<m;i++)
				snakeMap.put(sc.nextInt(),sc.nextInt());
			int[] dp = new int[101];
			Arrays.fill(dp,999999);
            dp[1] = 0;
			for(int i = 1;i<7;i++)
				dp[1+i] = 1;
            int[] visited = new int[101];
			for(int i = 7;i<101;i++)
				{
				for(int j = 1;j<7;j++)
                    if(!snakeMap.containsKey(i-j) && i>=7)
					   dp[i] = Math.min(dp[i],dp[i-j]+1);
				Iterator itr = ladderMap.keySet().iterator();
				while(itr.hasNext())
					{
						Integer key = (Integer) itr.next();
						if(ladderMap.get(key) == i)
							dp[i] = Math.min(dp[key],dp[i]);
					}
				
				if(snakeMap.containsKey(i) && visited[i] == 0)
                {
					dp[snakeMap.get(i)] = Math.min(dp[snakeMap.get(i)],dp[i]);
                    visited[i] = 1;
                    i = snakeMap.get(i);
                }
                
				}
			if(dp[100] == 999999)
				System.out.println("-1");
			else
				System.out.println(dp[100]);
		}
    }
}