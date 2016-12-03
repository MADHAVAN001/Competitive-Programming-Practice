import java.util.*;

public class maximum_element{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
n = sc.nextInt();
long max = 0;
ArrayList<Long> stack = new ArrayList();
while(n-->0)
{
int option = sc.nextInt();
if(option == 1)
{
long top = sc.nextLong();
stack.add(top);
if(top > max)
	max = top;
}
else
if(option == 2)
{
long num = stack.get(stack.size()-1);
stack.remove(stack.size()-1);
if(num == max)
{
max = 0;
for(int i = 0;i<stack.size();i++)
	if(max<stack.get(i))
		max = stack.get(i);
}
}
else
if(option == 3)
{
System.out.println(max);
}
}
}
}
