import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0;i<n;i++)
			array[i] = sc.nextInt();
		System.out.println(Arrays.binarySearch(array, v));
    }
}