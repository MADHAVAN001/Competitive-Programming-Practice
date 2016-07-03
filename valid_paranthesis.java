public class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0)
		return false;
	Stack<Character> stack = new Stack<Character>();
	for(int i = 0;i<s.length();i++)
	{
		if(s.charAt(i) == '{' || s.charAt(i) == '[' ||s.charAt(i) == '(')
			stack.push(s.charAt(i));
		if(s.charAt(i) == '}')
		{
			if(stack.size()>0 && stack.peek() == '{')
				stack.pop();
				else
				stack.push(s.charAt(i));
		}
		if( s.charAt(i) == ')')
		{
			if(stack.size()>0 && stack.peek() == '(')
				stack.pop();
				else
				stack.push(s.charAt(i));
		}
		if(s.charAt(i) == ']')
			if(stack.size()>0 && stack.peek() == '[')
				stack.pop();
				else
				stack.push(s.charAt(i));
	}
	if(stack.size() == 0)
		return true;	
	return false;
    }
}
