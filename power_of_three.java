public class power_of_three {
    public boolean isPowerOfThree(int n) {
	if(n == 0)
		return false;
        double pownum =  Math.log10(n)/Math.log10(3);
	if(Math.abs(pownum - Math.floor(pownum)) <Math.pow(10,-10))
		return true;
	else
		return false;
    }
}
