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
			int result = 0;
			for(int i = 0;i<n;i++)
				result = result^sc.nextInt();
			
			if(result != 0)
				System.out.println("First");
			else
				System.out.println("Second");
		}	
    }
}