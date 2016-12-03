public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || haystack.length()<needle.length())
		return -1;
		if(haystack.length() == 0 && needle.length() == 0)
		return 0;
	for(int i = 0;i<haystack.length();i++)
	{
		int size = needle.length();
		int j = 0;
		while(j<size && i+j<haystack.length())
		{
			if(needle.charAt(j) != haystack.charAt(i+j))
				break;
			j++;
		}
		if(j == size)
			return i;
	}	
	return -1;
    }
}
