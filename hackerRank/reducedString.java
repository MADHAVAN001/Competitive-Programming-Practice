import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		for(int i = 1;i<input.length();i++)
			if(input.charAt(i) == input.charAt(i-1))
			{
				input = input.substring(0,i-1)+input.substring(i+1);
				i = 0;
			}
		if(input.length() == 0)
			System.out.println("Empty String");
		else
			System.out.println(input);
    }
}