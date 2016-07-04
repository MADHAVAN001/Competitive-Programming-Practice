/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
List<Integer> list;
int j = -1;
    public NestedIterator(List<NestedInteger> nestedList) {
        list = new ArrayList<Integer>();
        addNumbers(nestedList);
    }
	public void addNumbers(List<NestedInteger> nestedList)
	{
		if(nestedList == null || nestedList.size() == 0)
			return;
		for(int i = 0;i<nestedList.size();i++)
		{
			if(nestedList.get(i).isInteger())
				list.add(nestedList.get(i).getInteger());
			else
				addNumbers(nestedList.get(i).getList());
		}
	}
	

    @Override
    public Integer next() {
        j++;
        return list.get(j);
    }

    @Override
    public boolean hasNext() {
        if(list == null || j+1 > list.size()-1)
		return false;
	return true;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
