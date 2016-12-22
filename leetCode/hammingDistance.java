public class Solution {
    int hammingDistance(int x, int y) {
        if(x<0 || y<0)
			return 0;
		int result = x^y;
		return Integer.bitCount(result);
    }
}