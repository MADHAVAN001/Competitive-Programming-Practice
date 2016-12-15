import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] countries = new int[n];
		for(int i = 0;i<n;i++)
			countries[i] = i;
		for(int i = 0;i<m;i++)
		{
			int left = sc.nextInt();
			int right = sc.nextInt();
            int rightSoln = countries[right];
			for(int j = 0;j<n;j++)
				if(countries[j] == rightSoln)
					countries[j] = countries[left];
		}
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i<n;i++)
			if(map.containsKey(countries[i]))
				map.replace(countries[i], map.get(countries[i])+1);
			else
				map.put(countries[i], new Integer(1));
		Iterator itr = map.keySet().iterator();
		int result = 0;
		while(itr.hasNext())
		{
			Integer key = (Integer) itr.next();
            Iterator itr1 = map.keySet().iterator();
            while(itr1.hasNext())
            {
                Integer key1 = (Integer) itr1.next();
                if(!key.equals(key1))
    			     result += map.get(key)*map.get(key1);
            }
		}
        result = result/2;
		if(map.size() == 1)
			System.out.println("0");
		else
			System.out.println(result);
    }
}