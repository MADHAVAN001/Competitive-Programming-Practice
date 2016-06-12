public class Solution {
    public int titleToNumber(String s) {
        List<Character> letter = new ArrayList<Character>();
	int length = s.size();
	int value = 0;
	for(int i = 0;i<s.length();i++)
	{
	value += Math.pow(26,i) * (Integer.valueOf(s.valueAt(s.length()-1 - i))-64);
	}
	return value;	 
    }
}
