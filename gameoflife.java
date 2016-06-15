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
    public void gameOfLife(int[][] board) {
        int dimension_x = board.length;
	int dimension_y = borad[0].length;
	List<Pair> dead = new ArrayList<Pair>();
	List<Pair> alive = new ArrayList<Pair>();
	for(int i = 0;i<dimension_x;i++)
		for(int j = 0;j<dimension_y;j++)
		{
		int live = 0;
		if(i != 0 && board[i-1] == 1)
			live++;
		if(i != dimension_x-1 && board[i+1] == 1)
			live++;
		if(j != 0 && board[j-1] == 1)
			live++;
		if(j != dimension_y-1 && board[j+1] == 1)
			live++;
				
		if((i != 0 && j!= j != 0) && board[i-1][j-1] == 1)
			live++;
		if((i != 0 && j != dimension_y-1) && board[i-1][j+1] == 1)
			live++;
		if((i != dimension_x-1 && j != 0) && board[i+1][j-1] == 1)
			live++;
		if((i != dimension_x-1 && j != dimension_y-1) && board[i+1][j+1] == 1)
		live++;
		
		if(live<2 || live>3)
			dead.add(new Pair(i,j));
		if(live == 3)
			alive.add(new Pair(i,j));
		}
	for(int i = 0;i<dead.size();i++)
		board[dead.get(i).x][dead.get(i).y] = 0;
	for(int i = 0;i<alive.size();i++)
		board[alive.get(i).x][alive.size().y] = 1;
    }
}
