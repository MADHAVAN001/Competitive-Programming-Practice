public class Solution {
    public String convertToTitle(int n) {
        int size = 0;
        if(n == 1)
            size = 1;
            else
            size = (int)Math.floor(Math.log10(n-1)/Math.log10(26));
	char[] result = new char[size+1];        
	int j = 0;
	while(n>=1)
	{
	    int k= (n-1)%26;
	result[j] = Character.toChars(k + 'A')[0];
	n = n/26;
	j++;
	}
	for(int i = 0;i<(size+1)/2;i++)
	{
		char t = result[i];
		result[i] = result[size-i];
		result[size-i] = t;
	}
	return String.valueOf(result);
    }
}
