package problems;

import java.util.Scanner;

public class maxsubarray{
	public static void main(String args[])
	{
		long t;
		Scanner scanner =  new Scanner(System.in);
		t = scanner.nextLong();
		while(t-->=0)
		{
			long n;
			n = scanner.nextLong();
			long sum_noncontg = 0;
			long[] array = new long[100000];
			long max = (long) (-1 * Math.pow(10, 5));
			for(int i = 0;i<n;i++)
			{
				array[i] = scanner.nextLong();
				if(array[i]>0)
					sum_noncontg += array[i];
				if(array[i]>max)
					max = array[i];
			}
			
			long max_so_far = 0, max_ending_here = 0;
			for(int i = 0;i<n;i++)
			{
				max_ending_here = max_ending_here + array[i];
				if(max_ending_here<0)
					max_ending_here = 0;
				if(max_so_far<max_ending_here)
					max_so_far = max_ending_here;
			}
			if(max>0)
				System.out.println(max_so_far +" "+ sum_noncontg);
			else
				System.out.println(max +" "+ max);
			
		}
	}
}