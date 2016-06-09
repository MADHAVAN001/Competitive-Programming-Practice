import java.util.Scanner;

public class maximizing_xor{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int l,r,solution = 0;
l = sc.nextInt();
r = sc.nextInt();
for(int i = l;i<=r;i++)
for(int j = i;j<=r;j++)
{
if(solution<(i^j))
	solution = i^j;
}

System.out.println(solution);
}
}

