import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(i = 0;i<s.length();i++)
			if(map.containsKey(s.charAt(i)))
				map.replace(s.charAt(i),map.get(s.charAt(i))+1);
			else
				map.put(s.charAt(i),new Integer(1));
		Map<Integer, Integer> set = new HashMap<Integer, Integer>();
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext())
		{
		Character key = (Character) itr.next();
		if(set.containsKey(map.get(key)))
			set.replace(map.get(key), set.get(map.get(key))+1);
		else
			set.put(map.get(key), new Integer(1));
		}
		if(set.size() > 2)
			System.out.println("NO");
		else if(set.size()==2)
		{
			Iterator itr = set.keySet().iterator();
			int tmp = 0;
			while(itr.hasNext())
				{
				Integer key = (Integer) itr.next();
				if(set.get(key) == 1)
					tmp = 1;
				}
			if(tmp == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else
			System.out.println("YES");			
    }
}