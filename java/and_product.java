import java.util.Scanner;

public class and_product
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int t;
long x,y;
t = sc.nextInt();
while(t-->0)
{
x = sc.nextLong();
y = sc.nextLong();
for(long i = x+1;i<y;i++)
	x = x&i;
System.out.println(x);
}
}
}
