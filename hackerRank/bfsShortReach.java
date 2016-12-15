import java.io.*;
import java.util.*;

public class Solution {

	public static class Pair{
		public int x,y;
		public Pair(int x, int y)
		{
		this.x = x;
		this.y = y;
		}
		public boolean equals(Object o)
		{
		if(!(o instanceof Pair))
			return false;
		Pair objo = (Pair) o;
		return (this.x == objo.x && this.y==objo.y);
		}
		public int hashCode()
		{
		return x^y;
		}
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int graph[][] = new int[n][n];
			for(int i = 0;i<m;i++)
			{
				int left = sc.nextInt()-1;
				int right = sc.nextInt()-1;
				graph[left][right] = 1;
				graph[right][left] = 1;
			}
			int visited[] = new int[n];
			int distance[] = new int[n];
			ArrayList<Pair> queue = new ArrayList<Pair>();
			int start = sc.nextInt()-1;
			queue.add(new Pair(start,0));
			
			distance[start] = 0;
			while(queue.size()>0)
			{
				Pair left = queue.get(0);
                if(visited[left.x] == 1)
                    {
                    queue.remove(0);
                    continue;
                }
				for(int i = 0;i<n;i++)
					if(graph[left.x][i] == 1 && visited[i] != 1 && left.x != i)
						{
							queue.add(new Pair(i, left.y+1));
						}
				visited[left.x] = 1;
				distance[left.x] = left.y;
                queue.remove(0);
			}
			
			for(int i = 0;i<n;i++)
               if(i != start)
				if(distance[i] == 0)
					System.out.print("-1 ");
				else
					System.out.print((6*distance[i])+" ");
			System.out.println();
		}
    }
}