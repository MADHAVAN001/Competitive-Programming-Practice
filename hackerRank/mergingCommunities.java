import java.io.*;
import java.util.*;

public class Solution {
public static class DisjointSets{
	int[] rank, parent;
	int n;
	
	public DisjointSets(int n)
	{
		rank = new int[n];
		parent = new int[n];
		this.n = n;
		
		for(int i = 0;i<n;i++)
            {
			parent[i] = i;
            rank[i] = 1;    
        }
	}
	
	public int find(int x)
	{
		if(parent[x] != x)
			parent[x] = find(parent[x]);
		return parent[x];
	}
	
	public void union(int x, int y)
	{
	int setx = find(x);
	int sety = find(y);
	if(setx == sety)
		return;
        
	if(rank[setx] < rank[sety])
	{
		parent[setx] = sety;
		rank[sety] += rank[setx];
	}
	else if(rank[setx] > rank[sety])
	{
		parent[sety] = setx;
		rank[setx] += rank[sety];
	}
	else
		{
		parent[sety] = setx;
		rank[setx] += rank[sety];
		}
	}
	
	public int getCommunitySize(int n)
	{
        return rank[find(n)];
	}
	
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        sc.nextLine();
		DisjointSets sets = new DisjointSets(n);
		while(m-->0)
		{
			Character query = sc.findInLine(".").charAt(0);
			if(query.equals(new Character('Q')))
			{
			int left = sc.nextInt();
			System.out.println(sets.getCommunitySize(left-1));
			}
			if(query.equals(new Character('M')))
			{
			int left = sc.nextInt()-1;
			int right = sc.nextInt()-1;
			sets.union(left,right);
			}
            sc.nextLine();
		}
    }
}