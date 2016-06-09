import java.util.Scanner;

public class lonely_integer{
public static void main(String args[])
{
int n, solution;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
solution = sc.nextInt();
for(int i = 1;i<n;i++)
{
int t;
t = sc.nextInt();
solution = solution^t;
}
System.out.println(solution);
}
}
