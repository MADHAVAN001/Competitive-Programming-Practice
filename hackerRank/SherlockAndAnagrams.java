import java.io.*;
import java.util.*;

public class Solution {
	public static int check_anagram(String s1, String s2)
		{
			char a[] = s1.toCharArray();
			char b[] = s2.toCharArray();
			//System.out.println(s1+" "+s2);
		   int first[] = new int[26];
			int second[] = new int[26];
			Arrays.fill(first,0);
			Arrays.fill(second,0);
			int c=0;
		   while (c<a.length) {
			  first[a[c]-'a']++;
			  c++;
		   }
		   c = 0;
		   while (c<b.length) {
			  second[b[c]-'a']++;
			  c++;
		   }

		   for (c = 0; c < 26; c++) {
			  if (first[c] != second[c])
				 return 0;
		   }

		   return 1;
		}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        sc.nextLine();
		while(t-->0)
		{
		String s;
		s = sc.nextLine();
		int length = s.length();
		long count = 0;
		for(int i = 1;i<length;i++)
			for(int j = 0;j<length-i+1;j++)
			{
            for(int k = j+1;k<length-i+1;k++)
				{
                    
    					if(check_anagram(s.substring(j,j+i),s.substring(k,k+i))==1)
    					   count++;
    			}
				
			}
            System.out.println(count);
		}
		
    }
}