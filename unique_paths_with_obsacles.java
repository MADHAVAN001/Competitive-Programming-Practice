public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
	int n = obstacleGrid[0].length;
	int[][] paths = new int[m][n];
	for(int i = 0;i<m;i++)
		if(obstacleGrid[i][0] == 1)
			paths[i][0] = 0;
		else
		if(i != 0)
			paths[i][0] = paths[i-1][0];
		else
			paths[i][0] = 1;
	for(int i = 0;i<n;i++)
		if(obstacleGrid[0][i] == 1)
			paths[0][i] = 0;
		else
		if(i != 0)
			paths[0][i] = paths[0][i-1];
		else
			paths[0][i] = 1;
	for(int i = 0;i<m;i++)
		for(int j = 0;j<n;j++)
			if(obstacleGrid[i][j] == 1)
				paths[i][j] = 0;
			else
				paths[i][j] = paths[i][j-1]+paths[i-1][j];
	return paths[m-1][n-1]; 
    }
}
