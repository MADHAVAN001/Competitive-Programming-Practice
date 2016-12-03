public class Solution {
    public int romanToInt(String s) {
	if(s == null || s.length() == 0)
		return 0;	
        Map<Character, Integer> map = new HashMap<Character,Integer>();
	map.put('I',1);
	map.put('V',5);
	map.put('X',10);
	map.put('L',50);
	map.put('C',100);
	map.put('D',500);
	map.put('M',1000);
	int value = 0;
	for(int i = s.length()-1;i>=0;i--)
		{
		if(i == s.length()-1)
			value += map.get(s.charAt(i));
		else
		{
		if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
			value -= map.get(s.charAt(i));
		else
			value += map.get(s.charAt(i));
		}
		}
	return value;
    }
