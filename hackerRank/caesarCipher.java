import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int k = sc.nextInt();
		String t = "";
		for(int i = 0;i<n;i++)
			if((s.charAt(i)>='a' && s.charAt(i)<='z'))
				t += (char)('a'+(s.charAt(i)+k-97)%26);
			else if((s.charAt(i)>='A' && s.charAt(i)<='Z'))
				t += (char)('A'+(s.charAt(i)+k-65)%26);
			else
				t+=s.charAt(i);
		System.out.println(t);
    }
}