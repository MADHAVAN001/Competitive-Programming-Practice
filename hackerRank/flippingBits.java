import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
            {
            long t = sc.nextLong();
            long value = (long)2*(Integer.MAX_VALUE)-t;
                System.out.println(value+1);

        }
    }
}