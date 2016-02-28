package problems;

import java.util.Scanner;

public class redjohn{
	public static void main(String args[])
	{
		int t;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		int[] array = new int[41];
		array[0] = 0;
		array[1] = 1;
		array[2] = 1;
		array[3] = 1;
		array[4] = 2;
		for(int i = 5;i<41;i++)
		{
			array[i] = array[i-1];
			if(i-4>0)
				array[i] += array[i-4];
			//System.out.println(i + " " + array[i]);
		}
		while(t-->0)
		{
			int n;
			n = scanner.nextInt();
			int num = 0;

			for(int i = 2;i<=array[n];i++)
			{
				if(isprime(i))
					num++;
			}
			System.out.println(num);
			//System.out.println(array[n]-num);
		}
	}
	
	public static boolean isprime(long n)
	{
		for(int j = 2;j*j<=n;j++)
			if(n%j == 0)
			{
				return false;
			}
		return true;
	}
}