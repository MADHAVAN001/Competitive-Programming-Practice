/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class first_bad_version extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
	int ending = n;
	int version = 0;
	while(start<=ending)
	{
		int mid = (int) start + (ending-start)/2;
		if(isBadVersion(mid) == true)
			{
				version = mid;
				ending = mid - 1;
			}
		else
			{
				start = mid+1;
			} 
	}
	return version;
    }
}
