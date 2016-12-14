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
		public int hashCode()
		{
			return x*y;
		}
		public boolean equals(Object o)
		{
			if(!(o instanceof Pair))
				return false;
			Pair obj = (Pair) o;
			return this.x == obj.x && this.y == obj.y;
		}
	}
	
	static int[][] matrix;
	static Map<Pair, Integer> map;
	static int m,n;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		matrix = new int[m][n];
		map = new HashMap<Pair,Integer>();
		int maxCount = 0;
        for(int i = 0;i<m;i++)
			for(int j = 0;j<n;j++)
				matrix[i][j] = sc.nextInt();
		for(int i = 0;i<m;i++)
			for(int j = 0;j<n;j++)
				if(!map.containsKey(new Pair(i,j)) && matrix[i][j] == 1)
					maxCount = Math.max(maxCount, floodFill(i,j));
        System.out.println(maxCount);
		}
	
	public static int floodFill(int x, int y)
	{
		if(map.containsKey(new Pair(x,y)))
            return 0;
        if(!(x<m && y<n && x>=0 && y>=0))
		    return 0;	
		if(matrix[x][y] == 0)
			return 0;
		map.put(new Pair(x,y), new Integer(1));
		return 1+floodFill(x-1,y-1)+floodFill(x-1,y)+floodFill(x-1,y+1)+floodFill(x,y-1)+floodFill(x+1,y-1)+floodFill(x,y+1)+floodFill(x+1,y+1)+floodFill(x+1,y);
	}
}