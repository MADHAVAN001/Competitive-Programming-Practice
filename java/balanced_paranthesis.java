import java.util.*;

public class balanced_paranthesis{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int t;
t = sc.nextInt();
sc.nextLine();
while(t-->0)
{
ArrayList<Character> stack = new ArrayList();
String paran = sc.nextLine();
for(int i =0;i<paran.length();i++)
{
if(stack.size() == 0)
{
	stack.add(paran.charAt(i));
continue;
}
if(stack.get(stack.size()-1) == '{' && paran.charAt(i) == '}')
	stack.remove(stack.size()-1);
else
if(stack.get(stack.size()-1) == '(' && paran.charAt(i) == ')')
	stack.remove(stack.size()-1);

else
if(stack.get(stack.size()-1) == '[' && paran.charAt(i) == ']')
	stack.remove(stack.size()-1);
else
	stack.add(paran.charAt(i));

}
if(stack.size() == 0)
	System.out.println("YES");
else
	System.out.println("NO");
}
}
}

