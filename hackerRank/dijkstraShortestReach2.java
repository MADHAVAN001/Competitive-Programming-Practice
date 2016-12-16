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
			int[][] matrix = new int[n][n];
			int m = sc.nextInt();
			for(int i = 0;i<m;i++)
			{
				int left = sc.nextInt()-1;
				int right = sc.nextInt()-1;
				int distance = sc.nextInt();
                if(matrix[left][right] == 0)
                    {
    				matrix[left][right] = distance;
			 	    matrix[right][left] = distance;
                }
                else
                    {
                	matrix[left][right] = Math.min(distance, matrix[left][right]);
			 	    matrix[right][left] = Math.min(distance,matrix[right][left]);
                    
                }
			}
			int start = sc.nextInt()-1;
			
				
				int[] distance = new int[n];
				Arrays.fill(distance, Integer.MAX_VALUE);
				
				distance[start] = 0;
				Set<Integer> set = new HashSet<Integer>();
				for(int i = 0;i<n;i++)
					set.add(i);
				int numVisited = 0;
				while(!set.isEmpty())
				{
				
				int nextNode = -1;
				int minValue = Integer.MAX_VALUE;
				Iterator itr = set.iterator();
				while(itr.hasNext())
					{
					Integer node = (Integer) itr.next();
					if(distance[node.intValue()]<minValue)
						nextNode = node.intValue(); 
					minValue = Math.min(minValue, distance[node.intValue()]);
					}
				if(minValue == Integer.MAX_VALUE)
					break;
				set.remove(nextNode);
				
				for(int i = 0;i<n;i++)
					{
					if(matrix[nextNode][i] !=0 )
						{
						distance[i] = Math.min(distance[i], distance[nextNode]+matrix[nextNode][i]);
						}
					}
				}
				
				for(int i = 0;i<n;i++)
					if(i != start)
						if(distance[i] != Integer.MAX_VALUE)
							System.out.print(distance[i]+" ");
						else
							System.out.print("-1 ");
				System.out.println("");
		}
    }
}