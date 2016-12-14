import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0;
        int[] array = new int[n];
		for(int i = 0;i<n;i++)
		{
			int num = sc.nextInt();
			map.put(num,new Integer(1));
            array[i] = num;
		}
        for(int i = 0;i<n;i++)
            if(map.containsKey(array[i]-k))
				count++;
        
		System.out.println(count);
	}
}