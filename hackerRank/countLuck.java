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
	
	static Character[][] matrix;
	static int m,n;
	static Map<Pair, Integer> map;
	static int maxCount;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			m = sc.nextInt();
			n = sc.nextInt();
			matrix = new Character[m][n];
            sc.nextLine();
			map = new HashMap<Pair, Integer>();
			for(int i = 0;i<m;i++)
			{
					String line = sc.nextLine();
					for(int j = 0;j<n;j++)
						matrix[i][j] = line.charAt(j);
			}
			int value = sc.nextInt();
			for(int i = 0;i<m;i++)
				for(int j = 0;j<n;j++)
					if(matrix[i][j].equals('M'))
                {
                findPath(i,j,0);
                if(value == maxCount)
						System.out.println("Impressed");
                else
                    System.out.println("Oops!");
            }
		}
    }
	
	public static void findPath(int x, int y, int count)
	{
		if(map.containsKey(new Pair(x,y)))
			return ;
		if(!(x>=0 && y>=0 && x<m && y<n))
			return ;
		if(matrix[x][y].equals('X'))
            return ;
		if(matrix[x][y].equals('*'))
			maxCount = count;
        map.put(new Pair(x,y), new Integer(1));
		int tmpCount = 0;
		
		if(getElement(x-1,y).equals('.'))
			tmpCount++;
		if(getElement(x,y-1).equals('.'))
			tmpCount++;
		if(getElement(x,y+1).equals('.'))
			tmpCount++;
		if(getElement(x+1,y).equals('.'))
			tmpCount++;			
		if(tmpCount>1)
			count++;
		
		findPath(x-1,y, count);
		findPath(x,y-1, count);
		findPath(x,y+1, count);
		findPath(x+1,y, count);
		
	}
	public static Character getElement(int x, int y)
	{
		if(!(x>=0 && y>=0 && x<m && y<n) || map.containsKey(new Pair(x,y)))
			return new Character('X');
        if(matrix[x][y].equals('*'))
            return new Character('.');
		return matrix[x][y];
	}
}