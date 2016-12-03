public class is_anagram {
    public boolean isAnagram(String s, String t) {
	if(s.length() == 0 && t.length() == 0)
		return true;
        if(s.length() != t.length() || s.length() == 0 || t.length() == 0)
		return false;
	Map<Character,Integer> s_char = new HashMap<Character,Integer>();
	for(int i = 0;i<s.length() ; i++)
	{
		if(s_char.containsKey(s.charAt(i)))
		{
			Character key = s.charAt(i);
			int value = s_char.get(key);
			s_char.replace(key, value, value + 1);
		}
		else
		{
			s_char.put(s.charAt(i),1);
		}
	}
	for(int i = 0;i<t.length();i++)
	{
		if(s_char.containsKey(t.charAt(i)))
		{
			Character key = t.charAt(i);
			int value = s_char.get(key);
			if(s_char.get(key) == 0)
				return false;
			else
				s_char.replace(key,value,value-1);
		}
		else 
		    return false;
	}
	return true;
    }
}
