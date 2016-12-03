public class Solution {

public class Pair{
	public int x;
	public int y;
	public Pair(int x, int y)
	{
	this.x = x;
	this.y = y;
	} 
}


    public void setZeroes(int[][] matrix) {
        int dimension_x = matrix.length;
	int dimension_y = matrix[0].length;
	List<Pair> points = new ArrayList<Pair>();
	
	for(int i = 0;i<dimension_x;i++)
		for(int j = 0;j<dimension_y;j++)
		{
		if(matrix[i][j] == 0)
			points.add(new Pair(i,j));
		}
	for(int i = 0;i<points.size();i++)
	{
		for(int j = 0;j<dimension_y;j++)
			matrix[points.get(i).x][j] = 0;
		for(int j = 0;j<dimension_x;j++)
			matrix[j][points.get(i).y] = 0;
	}
    }
}
