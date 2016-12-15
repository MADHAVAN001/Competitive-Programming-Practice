import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
		Set<Character> set = new HashSet<Character>();
		for(int i = 0;i<s.length();i++)
			set.add(s.charAt(i));
		Iterator itr = set.iterator();
		List<Character> list = new ArrayList<Character>();
		while(itr.hasNext())
			list.add((Character)itr.next());
		int matrix[][] = new int[list.size()][list.size()];
		char[] array = s.toCharArray();
		
		int length = 0;
		List<Character> stringList = new ArrayList<Character>();
        for(int i = 0;i<array.length;i++)
            stringList.add(array[i]);
		for(int i = 0;i<list.size();i++)
			for(int j = i+1;j<list.size();j++)
				{
				List<Character> subList = new ArrayList<Character>(stringList);
				itr = set.iterator();
				while(itr.hasNext())
					{
					Character character = (Character) itr.next();
                    List<Character> charList = new ArrayList<Character>();
                    charList.add(character);
					if(!character.equals(list.get(i))&& !character.equals(list.get(j)))
						subList.removeAll(charList);
					}
				if(checkValidity(subList))
					length = Math.max(length, subList.size());
				}
		System.out.println(length);
    }
	public static boolean checkValidity(List<Character> list)
	{
	if(list.size() == 0)
		return false;
	for(int i = 1;i<list.size();i++)
		if(list.get(i).equals(list.get(i-1)))
			return false;
	return true;
	}
}
