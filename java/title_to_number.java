public class Solution {
    public String convertToTitle(int n) {
	ArrayList<Character> column_number = new ArrayList<Character>();
	while(n>=1)
	{
	column_number.add((int) ((n-1)%26 +65));
	n = n%26;
	}
	char[] res = new char[column_number.length()];
	for(int i = column_number.length()-1;i>=0;i--)
		res[column_number.length()-1-i] = column_number.get(i);
        }
	return String.valueOf(res);
}
