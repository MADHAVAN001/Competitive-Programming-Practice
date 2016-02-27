package problems;

import java.math.BigInteger;
import java.util.Scanner;

public class fibonacci_modified{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int a,b,n;
		a = scanner.nextInt();
		b = scanner.nextInt();
		n = scanner.nextInt();
		BigInteger[] array  = new BigInteger[20];
		array[0] = BigInteger.valueOf(a);
		array[1] = BigInteger.valueOf(b);
		for(int i = 2;i<=n-1;i++)
		{
			array[i] = (array[i-1].multiply(array[i-1])).add(array[i-2]);
		}
		System.out.println(array[n-1]);
		scanner.close();
	}
}