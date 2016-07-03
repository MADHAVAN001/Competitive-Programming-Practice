public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0)
		return 0;
	String[] array = s.split(" ");
	int value = 0;	
	for(String itr:array)
	{
		if(itr.length()>0 && itr != " ")
			value = itr.length();
	}
	return value;
    }
}
