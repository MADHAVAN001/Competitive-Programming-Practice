import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arrayA = new ArrayList<Integer>();
		for(int i = 0;i<n;i++)
			arrayA.add(sc.nextInt());
		int m = sc.nextInt();
		List<Integer> arrayB = new ArrayList<Integer>();
		for(int i = 0;i<m;i++)
        {
            int num = sc.nextInt();
			arrayB.add(num);
            if(arrayA.contains(num))
            {
                arrayA.remove(new Integer(num));
                arrayB.remove(new Integer(num));
            }
        }
        
		Integer[] arrayC = new Integer[arrayB.size()];
        arrayB.toArray(arrayC);
        Arrays.sort(arrayC);
		for(int i = 0;i<arrayB.size();i++)
           if(i==0 || !arrayC[i].equals(arrayC[i-1]))
            System.out.print(arrayC[i]+" ");
    }
}