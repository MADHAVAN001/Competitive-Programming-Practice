import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0;i<n;i++)
			array[i] = sc.nextInt();
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> equal = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int pivot = array[0];
		for(int i = 0;i<n;i++)
			if(array[i]<pivot)
				left.add(array[i]);
			else if(array[i]>pivot)
				right.add(array[i]);
			else
				equal.add(array[i]);
		
		for(int i = 0;i<left.size();i++)
			System.out.print(left.get(i)+" ");
		for(int i = 0;i<equal.size();i++)
			System.out.print(equal.get(i)+" ");
		for(int i = 0;i<right.size();i++)
			System.out.print(right.get(i)+" ");
		}
}