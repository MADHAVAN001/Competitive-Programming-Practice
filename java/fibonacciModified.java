import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		BigInteger t1,t2;
		int n;
		Scanner sc = new Scanner(System.in);
		t1 = new BigInteger(""+sc.nextLong());
		t2 = new BigInteger(""+sc.nextLong());
		n = sc.nextInt();
		boolean bit = false;
		
		for(int i = 0;i<n;i++)
		{
			if(bit)
			{
				BigInteger tmp = t2.multiply(t2);
				t1 = t1.add(tmp);
			}
			else
			{
				BigInteger tmp = t1.multiply(t1);
				t2 = t2.add(tmp);
			}
			bit = ~bit;		
		}
		if(bit)
			System.out.println(t2);
		else
			System.out.println(t1);
    }
}