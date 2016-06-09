public class Solution {
    public String reverseString(String s) {
        char[] character = s.toCharArray();
	for(int i = 0;i<s.length()/2;i++)
	{
	char t = s.charAt(i);
	character[i] = s.charAt(s.length()-1-i);
	character[s.length()-1-i] = t;
	}
	return String.valueOf(character);
    }
}
