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
			int array[] = new int[n];
			int left[] = new int[n];
			int right[] = new int[n];
			left[0] = 0;
			right[n-1] = 0;
			for(int i = 0;i<n;i++)
				array[i] = sc.nextInt();
			for(int i = 1;i<n;i++)
				left[i] = left[i-1]+array[i-1];
			for(int i = n-2;i>=0;i--)
				right[i] = right[i+1]+array[i+1];
			int count = 0;
			for(int i = 0;i<n;i++)
				if(left[i]==right[i])
					count++;
			if(count == 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
    }
}