import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
        sc.nextLine();
		String s = sc.nextLine();
		String solution = "";
		long oneCount = 0;
		solution += s.charAt(0);
		if(solution.equals("1"))
			oneCount++;
			
		for(int i = 1;i<k;i++)
		{
			if(s.charAt(i) == '0')
				if(oneCount%2 == 0)
					solution += s.charAt(i);
				else
				{
					solution += '1';
					oneCount++;
				}	
			if(s.charAt(i) == '1')
				if(oneCount%2 == 1)
					solution += '0';
				else
                    {
					solution += s.charAt(i);
                    oneCount++;
                }
		}
        for(int i = k;i<n;i++)
        {
            if(solution.charAt(i-k) == '1')
                oneCount--;
            if(s.charAt(i) == '0')
				if(oneCount%2 == 0)
					solution += s.charAt(i);
				else
				{
					solution += '1';
					oneCount++;
				}	
			if(s.charAt(i) == '1')
				if(oneCount%2 == 1)
					solution += '0';
				else
                    {
					solution += s.charAt(i);
                    oneCount++;
                }
            
        }
		System.out.println(solution);
    }
}