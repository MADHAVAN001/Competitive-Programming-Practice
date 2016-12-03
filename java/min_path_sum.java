public class Solution {
    public int minPathSum(int[][] grid) {
	int m = grid.length;
	int n = grid[0].length;	
	if(grid == null || m == 0 || n == 0)
		return 0;
	int[][] pathSum = new int[m][n];
	pathSum[0,0] = grid[0][0];
	for(int i = 1;i<m;i++)
		pathSum[i][0] = pathSum[i-1][0] + grid[i][j];
	for(int i = 1;i<n;i++)
		pathSum[0][i] = pathSum[0][i-1] + grid[i][j];
	for(int i = 1;i<m;i++)
		for(int j = 1;j<n;j++)
		pathSum[i] = Math.min(pathSum[i-1][j],pathSum[i][j-1]) + grid[i][j];
	return grid[m-1][n-1];
   }
}
