import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toLowerCase();
		Set<Character> set = new HashSet<Character>();
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				set.add(s.charAt(i));
		}
		if(set.size() == 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
    }
}