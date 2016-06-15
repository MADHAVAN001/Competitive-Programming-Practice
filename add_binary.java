public class Solution {
    public String addBinary(String a, String b) {
        if(a == null || b == null )
            return null;
        if(a.length() == 0 && b.length() == 0)
            return "0";
        if(a.length() == 0 || b.length() == 0)
		return (a.length()==0)?b:a;
	char[] a_array = a.toCharArray();
	char[] b_array = b.toCharArray();
	char carry = '0';
	Stack stack = new Stack();
	int i = a.length() - 1;
	int j = b.length() - 1;
	int one = 2*Character.getNumericValue('0')+ Character.getNumericValue('1');
	int zero = Character.getNumericValue('0') *3;
	int three = 3* Character.getNumericValue('1');
	while(i != -1 && j != -1)
	{
		int sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j)) + Character.getNumericValue(carry);
		carry = '0';
		if(sum  == one)
			stack.push('1');
		else
		if(sum == zero)
			stack.push('0');
		else
		if(sum == three)
		       {
		           stack.push('1');
		           carry = '1'; 
		       }
		       else
		{
		carry = '1';
		stack.push('0');
		}
		i--;
		j--;
	}
	while(i == -1 && j!=-1)
	{
		int sum = Character.getNumericValue(b.charAt(j)) + Character.getNumericValue(carry);
		carry = '0';
		if(sum  == one)
			stack.push('1');
		else
		if(sum == zero)
			stack.push('0');
		else
		{
		carry = '1';
		stack.push('0');
		}
		j--;
	}
	while(i != -1 && j ==-1)
	{
	int sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(carry);
		carry = '0';
		if(sum  == one)
			stack.push('1');
		else
		if(sum == zero)
			stack.push('0');
		else
		{
		carry = '1';
		stack.push('0');
		}
		i--;
	}
	if(carry == '1')
		stack.push('1');
	String result = "";
	while(!stack.empty())
	{
	result += stack.pop();
	}
	return result;
    }
}
