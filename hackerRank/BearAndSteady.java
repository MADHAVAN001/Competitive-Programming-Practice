import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.nextLine();
		String s = sc.nextLine();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0;i<s.length();i++)
			if(map.containsKey(s.charAt(i)))
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			else
				map.put(s.charAt(i),new Integer(1));
		
		Iterator itr = map.keySet().iterator();
        Map<Character,Integer> updatedMap = new HashMap<Character,Integer>(map);
        int minLength = 0;
        
        while(itr.hasNext())
        {
            Character key = (Character)itr.next();
            if(map.get(key)<=n/4)
                updatedMap.remove(key);
            else
                {
                updatedMap.replace(key, map.get(key)-n/4);
                minLength+= updatedMap.get(key);
            }
            
        }
        if(updatedMap.size() == 0)
            {
            System.out.println("0");
            return;
        }
        int minCount = s.length();
		for(int i = 0;i<s.length();i++)
			{
            if(!updatedMap.containsKey(s.charAt(i)) && i-minLength<0)
                continue;
            Map<Character, Integer> tmpMap = new HashMap<Character, Integer>(updatedMap);
			int count = 0;
            for(int j = i;j<s.length();j++)
            {
                if(tmpMap.size() == 0)
                    break;
                if(tmpMap.containsKey(s.charAt(j)) && tmpMap.get(s.charAt(j))>0)
                {
                    tmpMap.replace(s.charAt(j), tmpMap.get(s.charAt(j))-1);
                    if(tmpMap.get(s.charAt(j)) == 0)
                        tmpMap.remove(s.charAt(j));
                }
                count++;
            }
            if(count!=0 && tmpMap.size() == 0)
                minCount = Math.min(count,minCount);    
			}
		System.out.println(minCount);		
    }
}