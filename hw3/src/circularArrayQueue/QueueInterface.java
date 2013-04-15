package circularArrayQueue;

public interface QueueInterface<T> {
	
	public void enqueue(T element, Class <T> type);
	
	public T dequeue();
	
	public void doublearray(int initialCapacity, Class <T> type);
	
	public boolean isempty();
	
	public boolean isfull();
	
	public void clear();
	
	public int size();
	
	public String toString();
}
