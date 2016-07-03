public class Solution {
    public int compareVersion(String version1, String version2) {
        if(version1 == null && version2 == null)
		return 0;
	if(version1 == null)
		return -1;
	if(version2 == null)
		return 1;
	String[] version1_a = version1.split("[.]");
	String[] version2_a = version2.split("[.]");
	int minLength = version1_a.length<version2_a.length?version1_a.length:version2_a.length;
	for(int i = 0;i<minLength;i++)
		{
			if(Integer.parseInt(version1_a[i]) > Integer.parseInt(version2_a[i]))
				return 1;
			else
			if(Integer.parseInt(version1_a[i]) < Integer.parseInt(version2_a[i]))
				return -1;
		}
	if(version1_a.length==version2_a.length)
		return 0;
	int i = minLength;
	int num = 0;
	while(version1_a.length-minLength>0)
	{
		if(Integer.parseInt(version1_a[i]) == 0)
			num++;
		else
			return 1;
		i++;
	}
	while(version2_a.length-minLength>0)
	{
		if(Integer.parseInt(version1_a[i]) == 0)
			num++;
		else
			return -1;
		i++;
	}
	if(num == version2_a.length-minLength || num == version1_a.length-minLength)
		return 0;
	return version1_a.length>version2_a.length?1:-1;
    }
}
