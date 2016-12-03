public class h_index {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0)
		return 0;
	Arrays.sort(citations);
	int h_index = 0;
	for(int i = 0; i<citations.length;i++)
	{
		if(citations.length-i >= citations[i] || citations.length-i>i)
			h_index = citations[i]>i?citations[i]:i;
	}
	if(citations[0]>citations.length)
		h_index = citations.length;
	return h_index;
    }
}
