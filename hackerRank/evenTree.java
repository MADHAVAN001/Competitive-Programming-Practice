import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] children = new int[n];
		Arrays.fill(children,1);
		int [][] edges = new int[m][2];
		int[] marked = new int[m];
		Set<Integer> childSet = new HashSet<Integer>();
		Set<Integer> parentSet = new HashSet<Integer>();
		for(int i = 0;i<m;i++)
		{
			int child = sc.nextInt();
			int parent = sc.nextInt();
			edges[i][0] = child-1;
			edges[i][1] = parent-1;
			childSet.add(child-1);
			parentSet.add(parent-1);
		}
		while(childSet.size() !=0)
		{
            Set<Integer> subChild = new HashSet<Integer>(childSet);
			subChild.removeAll(parentSet);
			
			childSet = new HashSet<Integer>();
			parentSet = new HashSet<Integer>();
			
			for(int i = 0;i<m;i++)
			{
				if(subChild.contains(edges[i][0]) && marked[i] != 1)
					{
                    	children[edges[i][1]] += children[edges[i][0]];
						marked[i] = 1;
					}
					else if(marked[i] != 1)
					{
						childSet.add(edges[i][0]);
						parentSet.add(edges[i][1]);
					}
			}
		}
		int count = 0;
        for(int i = 0;i<n;i++)
         {
			if(children[i]%2==0)
				count++;
        }
		System.out.println(count-1);
		
    }
}