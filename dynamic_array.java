import java.util.Scanner;
import java.util.*;

public class dynamic_array{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
List<ArrayList<Long>> new_list = new ArrayList<ArrayList<Long>>();
long q,last_ans = 0;
int n;
n = sc.nextInt();
q = sc.nextLong();
for(int i = 0;i<n;i++)
{
ArrayList nodes = new ArrayList<Long>();
new_list.add(nodes);
}
while(q-->0)
{
int type;
long x,y;
type = sc.nextInt();
x = sc.nextLong();
y = sc.nextLong();
long seq = (int)((x^last_ans)%n);
if(type == 1)
{
ArrayList<Long> nodes = new_list.get(seq);
ArrayList<Long> nodes_new = new_list.get(seq);
nodes_new.add(y);
new_list.remove((int)seq);
new_list.add((int)seq,nodes);
}
else
if(type == 2)
{
last_ans = new_list.get(seq).get((int)y);
System.out.println(last_ans);
}
}

}
}
