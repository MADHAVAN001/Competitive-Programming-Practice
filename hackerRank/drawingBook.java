import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        
		if(n%2 == 0)
			System.out.println(Math.min((p)/2, (n+1-p)/2));
		else
			System.out.println(Math.min((p)/2, (n-p)/2));
    }
}
