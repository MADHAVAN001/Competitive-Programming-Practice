import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0;i<s.length();i++)
			if(map.containsKey(s.charAt(i)))
				map.replace(s.charAt(i), map.get(s.charAt(i))+1);
			else
				map.put(s.charAt(i), 1);
		
		Iterator itr = map.keySet().iterator();
		int num = 0;
		int soln = 1;
		while(itr.hasNext())
		{
		Character key = (Character) itr.next();
		if(map.get(key)%2 == 1)
			num++;
		else if(map.get(key) %2 != 0)
			{
			soln = 0;
			break;
			}
		}
		if(soln == 0 || num > 1)
			System.out.println("NO");
		else
			System.out.println("YES");
    }
}