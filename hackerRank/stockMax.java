import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		int n = sc.nextInt();
		int price[] = new int[n];
		for(int i = 0;i<n;i++)
			price[i] = sc.nextInt();
		int sellPrice[] = new int[n];
		sellPrice[n-1] = price[n-1];
		for(int i = n-2;i>=0;i--)
			sellPrice[i] = Math.max(sellPrice[i+1], price[i+1]);
		long profit = 0;
		for(int i = 0;i<n;i++)
			profit += (sellPrice[i]-price[i]>0)?(sellPrice[i]-price[i]):0;
		System.out.println(profit);
		}
    }
}