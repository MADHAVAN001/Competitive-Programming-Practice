public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0)
		return 0;
	int start = 0;
	int ending = citations.length-1;
	int h_index = 0;
	while(start<ending)
	{
	int mid = (int)(start + ending)/2;
	if(citations.length-mid>=citations[mid])
	{
		
		h_index = h_index>citations[mid]?h_index:citations[mid];
		start = mid +1;
	}
	else
	{
		ending = mid-1;
		if(citations[mid]>0)
			h_index = h_index>(citations.length-mid)?h_index:(citations.length-mid);
	}
	}
return h_index;
    }
}
