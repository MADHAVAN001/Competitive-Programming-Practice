import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		String left = sc.nextLine();
		String right = sc.nextLine();
		int dp[][] = new int[left.length()+1][right.length()+1];
		for(int i = 0;i<left.length();i++)
			for(int j = 0;j<right.length();j++)
				if(left.charAt(i) == right.charAt(j))
					dp[1+i][1+j] = dp[i][j]+1;
				else
					dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
		System.out.println(dp[left.length()][right.length()]);
    }
}