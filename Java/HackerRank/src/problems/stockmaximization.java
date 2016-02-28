package problems;

import java.util.Scanner;

public class stockmaximization{
	public static void main(String args[])
	{
		int t;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		while(t-->0)
		{
			int n;
			n = scanner.nextInt();
			long[] array = new long[50000];
			for(int i = 0;i<n;i++)
			{
				array[i] = scanner.nextLong();
			}
			long[] price_after = new long[50000];
			price_after[n-1] = array[n-1];
			for(int i = n-2;i>=0;i--)
			{
				if(price_after[i+1]<array[i+1])
					price_after[i] = array[i+1];
				else
					price_after[i] = price_after[i+1];
			}
			long sum = 0;
			for(int i = 0;i<n;i++)
			{
				if(array[i]<price_after[i])
					sum += price_after[i]-array[i];
			}
			System.out.println(sum);
		}
		scanner.close();
}}