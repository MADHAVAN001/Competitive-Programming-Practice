public class power_two{
public static boolean isPowerOfTwo(int n)
{
int num = 0, one = 1;
if(n < 0 && (n!=-16 || n!= -8 ))
	n = ~n +1;
for(int i = 0;i<Integer.SIZE;i++)
	if((one & n>>>i) == 1)
		num++;
if( num == 1)
	return true;

return false;
}

public static void main(String args[])
{
System.out.println(isPowerOfTwo(-4));
}
}
