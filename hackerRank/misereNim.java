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
			long result = 0;
			boolean allOne = true;
            for(int i = 0;i<n;i++)
                {
                long num = sc.nextLong();
				result = result^num;
                if(num != 1)
                     allOne = false;
                }
            
            
			if((result != 0 && allOne == false) || (result == 0 && allOne))
				System.out.println("First");
			else
				System.out.println("Second");
            
		}	
    }
}