import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
		if(s.length() == 0)
			{
			System.out.println("0");
			}
		int count = 0;
		for(int i = 0;i<s.length();i++)
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				count++;
		System.out.println(count+1);
    }
}
