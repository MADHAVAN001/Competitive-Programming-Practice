import java.util.*;

public class reverse_bits{
public static int reverseBits(long n)
{

long new_n = 0;
int i = 0;
 while (n!=0){
	int tmp = n<<31;
	new_n = new_n | tmp>>>i;
          n = n/2;
	i++;
        }
return (int)new_n;
}

public static void main(String args[])
{
System.out.println(reverseBits(4294967295));
}
}
