import java.io.*;
import java.util.*;

public class Solution {
	
	public static class DisjointSets{
	int[][] sets;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public DisjointSets(int n)
	{
		sets = new int[n][2];
		for(int i = 0;i<n;i++)
		{
			sets[i][1] = i;
			map.put(i,1);
		}
	}
	
	public void mergeSets(int x, int y)
	{
	int setx = sets[x][1];
	int sety = sets[y][1];
	int rankx = map.get(setx);
	int ranky = map.get(sety);
	
    if(setx == sety)
        return;
    if(ranky<rankx)
		{
		for(int i = 0;i<sets.length;i++)
			{
				if(sets[i][1] == sety)
					sets[i][1] = setx;
			}
		map.remove(sety);
        map.put(setx, rankx+ranky);
		}
	else 
		{
		for(int i = 0;i<sets.length;i++)
			{
				if(sets[i][1] == setx)
					sets[i][1] = sety;
			}
		map.remove(setx);
        map.put(sety, rankx+ranky);
		}
	}
	
	public int findMinValue()
	{
	Iterator itr = map.keySet().iterator();
	int min = Integer.MAX_VALUE;
	while(itr.hasNext())
		{
		Integer key = (Integer) itr.next();
        if(map.get(key)!=1) 
    		min = Math.min(min, map.get(key));
		}
	return min;
	}
	
	public int findMaxValue()
	{
	Iterator itr = map.keySet().iterator();
	int max = Integer.MIN_VALUE;
	while(itr.hasNext())
		{
		Integer key = (Integer) itr.next();
		max = Math.max(max, map.get(key));
		}
	return max;
	}
	
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DisjointSets sets = new DisjointSets(2*n);
		for(int i = 0;i<n;i++)
		{
			int left = sc.nextInt()-1;
			int right = sc.nextInt()-1;
			sets.mergeSets(left,right);
		}
		System.out.println(sets.findMinValue()+" "+sets.findMaxValue());
    }
}