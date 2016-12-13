import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0)
		{
			long a = sc.nextInt();
			long b = sc.nextInt();
			long c = 1;
			if((int)Math.floor(Math.log(a)/Math.log(2)) != (int)Math.floor(Math.log(b)/Math.log(2)))
				{
				System.out.println("0");
				continue;
				}
			for(long i = a;i<=b;i++)
				c = c&i;
			System.out.println(c);
		}
    }
}