public class LRUCache {
    public class Pair implements Comparable{
	public int key;
	public int value;
	public int access;
	public Pair(int key, int value, int access)
	{
	this.key = key;
	this.value = value;
	this.access = access;
	}
	@Override
	public boolean equals(Object object)
	{
		if(this.getClass() != object.getClass() || object == null)
	return false;
		Pair obj = (Pair) object;
		return this.access == obj.access;
	}	
	@Override
	public int compareTo(Object object)
	{
	Pair obj = (Pair) object;
	if(this.access == obj.access)
		return 0;
	else
	if(this.access<obj.access)
		return -1;
	else
		return +1;
	}
	}
	PriorityQueue<Pair> queue;
	int capacity;
	int access;
    public LRUCache(int capacity) {
        queue = new PriorityQueue<Pair>(capacity);
	this.capacity = capacity;
	this.access = 0;
    }
    
    public int get(int key) {
        Iterator itr = queue.iterator();
	while(itr.hasNext())
	{
		Pair pair = (Pair)itr.next();
		if(pair.key == key)
			{
			itr.remove();
			pair.access = ++access;
			queue.add(pair);
			return pair.value;
			}
	}
	return -1;
    }
    
    public void set(int key, int value) {
	Iterator itr = queue.iterator();
	int position = -1;	
	while(itr.hasNext())
	{
		Pair pair = (Pair)itr.next();
		if(pair.key == key)
		{
			position = 0;
			break;
		}
	}


	if(capacity == 0 && position == -1)
	{
	queue.poll();
	queue.add(new Pair(key,value,++access));
	}
	else        
	if(position == -1)
	{	
	queue.add(new Pair(key,value,++access));
	capacity--;
	}
	else
	{
	itr = queue.iterator();
	while(itr.hasNext())
	{
		Pair pair = (Pair)itr.next();
		if(pair.key == key)
			itr.remove();
	}
	queue.add(new Pair(key,value,++access));
	}
    }
}
