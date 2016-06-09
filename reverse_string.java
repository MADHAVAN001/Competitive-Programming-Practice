import java.util.*;

public class reverse_string{
public static String reverseWords(String s) {
int num_spaces = 0;
String result = "";
for(int i = 0;i<s.length();i++)
	if(s.charAt(i) == ' ')
		num_spaces++;
if(num_spaces == s.length())
	return result;
List<String> list = new ArrayList();
int start = 0, ending = 0;
for(int i = 0;i<s.length();i++)
{
if(s.charAt(i) == ' ' && (i == 0 || s.charAt(i-1) == ' '))
	start = i+1;
else
if(s.charAt(i) == ' ')
{
	ending = i;
	if(s.substring(start,ending) != "")
		list.add(s.substring(start,ending));
	start = i+1;	
}
else
if(i == s.length()-1)
{
ending = i+1;
if(s.substring(start,ending) != "")
		list.add(s.substring(start,ending));
}
}
for(int i = list.size()-1;i>=0;i--)
	if(i !=0 )
        	result += list.get(i) + " ";
	else
		result += list.get(i);
return result;
}

public static void main(String args[])
{
	System.out.println(reverseWords("  1  ")+ "wer");
	
}
}
