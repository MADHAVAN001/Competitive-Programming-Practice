import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void insertIntoSorted(int[] ar) {
        if(ar == null || ar.length == 0)
			return;
		int element = ar[ar.length-1];
		for(int i = 0;i<ar.length-1;i++)
		{
			if(element<ar[ar.length-i-2])
            {
				ar[ar.length-i-1] = ar[ar.length-i-2];
                printArray(ar);
            }
			else 
            {
				ar[ar.length-i-1] = element;
                break;
            }
		}
        if(element<ar[0])
            ar[0] = element;
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
