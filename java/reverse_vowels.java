public class reverse_vowels {
    public String reverseVowels(String s) {
        if(s.length() == 0)
		return "";
	List<Character> vowels = new ArrayList<Character>();
	HashSet<Character> vow = new HashSet<Character>();
	vow.add('a');
	vow.add('e');
vow.add('i');
	vow.add('o');
	vow.add('u');
	vow.add('A');
	vow.add('E');
	vow.add('I');
	vow.add('O');
	vow.add('U');
	
	for(int i = 0;i<s.length();i++)
	{
		if(vow.contains(s.charAt(i)))
			vowels.add(s.charAt(i));
	}
	char[] array = s.toCharArray();
	int j = 0;
	for(int i = 0;i<s.length();i++)
	{
		if(vow.contains(s.charAt(i)))
			{
			array[i] = vowels.get(vowels.size()-1-j);
			j++;
			}
	}
return String.valueOf(array);	
    }
}
