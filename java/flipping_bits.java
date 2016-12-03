import java.util.Scanner;

public class flipping_bits{
public static void main(String args[])
{
long t;
Scanner sc = new Scanner(System.in);
t = sc.nextInt();
while(t-- >0)
{

long k = 4294967296L;
System.out.println(k + ~sc.nextLong());

}
}
}
