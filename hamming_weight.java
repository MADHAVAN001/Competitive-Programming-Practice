public class hamming_weight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

	int one = 1, count = 0;
        for(int i = 0;i<Integer.SIZE;i++)
	{
		if((one & n>>>i) == 1)
			count++;
	}
	return count;
    }
	
	public static void main(String args[])
{
System.out.println(hammingWeight(11));
}
}
