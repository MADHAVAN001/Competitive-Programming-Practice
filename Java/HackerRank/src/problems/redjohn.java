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
			array[i] = (int) (array[i-4] + Math.pow(2,Math.floor((Math.log(i)/Math.log(2)))));
			System.out.println(i+" "+array[i]);
		}
		while(t-->0)
		{
			int n;
			n = scanner.nextInt();
			int num = 0;
			for(int i = 2;i<=array[n];i++)
			{
				for(int j = 2;j<i;j++)
					if(i%j == 0)
					{
						num--;
						break;
					}
				num++;
			}
			System.out.println(num);
			//System.out.println(array[n]-num);
		}
	}
}