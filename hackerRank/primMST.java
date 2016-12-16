import java.io.*;
import java.util.*;

public class Solution {
	
	public static class Pair implements Comparable<Pair>{
	public int x,y;
	public Pair(int x, int y)
		{
		this.x = x;
		this.y = y;
		}
	public int hashCode()
	{
	return x^y;
	}
	
	public boolean equals(Object o)
	{
	if(!(o instanceof Pair))
		return false;
	Pair objo = (Pair) o;
	return this.x == x && this.y == y;
	}
	@Override
		public int compareTo(Pair o) {
			if(o.y<y)
				return 1;
			else
				if(o.y >y)
					return -1;
				else
					return 0;
		}
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, List<Pair>> map = new HashMap<Integer, List<Pair>>();
		for(int i = 0;i<m;i++)
		{
			int left = sc.nextInt()-1;
			int right = sc.nextInt()-1;
			int distance = sc.nextInt();
			if(map.containsKey(left))
			{
			List<Pair> list = map.get(left);
			list.add(new Pair(right, distance));
			map.replace(left, list);
			}
			else{
			List<Pair> list = new ArrayList<Pair>();
			list.add(new Pair(right,distance));
			map.put(left, list);
			}
			
			if(map.containsKey(right))
			{
			List<Pair> list = map.get(right);
			list.add(new Pair(left, distance));
			map.replace(right, list);
			}
			else{
			List<Pair> list = new ArrayList<Pair>();
			list.add(new Pair(left, distance));
			map.put(right, list);
			}
		}
		int start = sc.nextInt()-1;
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<n;i++)
			set.add(i);
		Set<Integer> primSet = new HashSet<Integer>();
		primSet.add(start);
		set.remove(start);
		int weightCount = 0;
		while(!set.isEmpty())
		{
			int minWeight = Integer.MAX_VALUE;
			int node = -1;
			Iterator itr = primSet.iterator();
			while(itr.hasNext())
			{
			Integer i = (Integer)itr.next();
			if(map.containsKey(i))
				{
					List<Pair> list = map.get(i);
					for(int j = 0;j<list.size();j++)
						{
						Pair pair = list.get(j);
						if(!primSet.contains(pair.x) && minWeight>pair.y)
							{
								minWeight = pair.y;
								node = pair.x;
							}
						}
				}
			}
			if(node != -1)
				{
				primSet.add(node);
				set.remove(node);
				weightCount+=minWeight;
				}
			else
				break;
		}
		System.out.println(weightCount);
    }
}