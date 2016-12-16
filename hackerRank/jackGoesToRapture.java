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
			return objo.x == x;
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
		else
			{
			List<Pair> list = new ArrayList<Pair>();
			list.add(new Pair(right, distance));
			map.put(left, list);
			}
			
		if(map.containsKey(right))
			{
			List<Pair> list = map.get(right);
			list.add(new Pair(left, distance));
			map.replace(right, list);
			}
		else
			{
			List<Pair> list = new ArrayList<Pair>();
			list.add(new Pair(left, distance));
			map.put(right, list);
			}
		}
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		pq.add(new Pair(0,0));
		
		int[] distance = new int[n];
		int[] visited = new int[n];
		Arrays.fill(distance,Integer.MAX_VALUE);
		distance[0] = 0;
		while(pq.size()!=0)
		{
			Pair nextNode = pq.peek();
			pq.remove(pq.peek());
			if(visited[nextNode.x] == 1)
				continue;
			List<Pair> list = map.get(nextNode.x);
			visited[nextNode.x] = 1;
            if(list == null)
                continue;
			for(int i = 0;i<list.size();i++)
			{
				Pair edge = list.get(i);
				if(visited[edge.x] == 0)
					pq.add(edge);
				else
					continue;
				if(distance[nextNode.x] < edge.y)
					distance[edge.x] = Math.min(edge.y, distance[edge.x]);
				else
					distance[edge.x] = Math.min(distance[edge.x], distance[nextNode.x]);
			}
		}
		if(distance[n-1] == Integer.MAX_VALUE)
			System.out.println("NO PATH EXISTS");
		else
			System.out.println(distance[n-1]);
    }
}