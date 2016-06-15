public class Solution {

public class count implements Comparable{
	public int key;
	public int value;
	
	public count(int key, int value)
	{
		this.key = key;
		this.value = value;
	}
	@Override
	public int compareTo(Object obj)
	{
	    count ct = (count) obj;
		return Integer.compare(this.value,ct.value); 
	}
}
    public List<Integer> topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0)
		return null;
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i = 0;i<nums.length;i++)
	{
		if(map.containsKey(nums[i]))
		{
			int value = map.get(nums[i]);
			map.replace(nums[i],value,value+1);
		}	
		else
		{
			map.put(nums[i],1);
		}
	}
	
	PriorityQueue<count> queue = new PriorityQueue(k);
	Iterator itr = map.entrySet().iterator();
	while(itr.hasNext())
	{
		Map.Entry entry  = (Map.Entry)itr.next();
		if(queue.size()>=k && queue.peek().value < (int)entry.getValue())
		{
		queue.poll();		
		queue.add(new count((int)entry.getKey(), (int)entry.getValue()));
		}
		else
		if(queue.size()<k)
		queue.add(new count((int)entry.getKey(),(int) entry.getValue()));
			
	}
	List<Integer> result = new ArrayList<Integer>();
	Stack stack = new Stack();
	Iterator it = queue.iterator();
	while(it.hasNext())
	{
		count ct = (count)it.next();
		stack.push(ct.key);
		it.remove();
	}
	while(!stack.empty())
	   {
	       result.add((int)stack.pop());
	   }
	return result;
    }
}
