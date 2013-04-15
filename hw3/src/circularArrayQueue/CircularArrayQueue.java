package circularArrayQueue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CircularArrayQueue<T> implements QueueInterface<T> {
	private int capacity = 20;
	private int front, back, count;
	private T[] queue;
	
	
	public CircularArrayQueue(int initialCapacity, Class <T> type){
		queue = (T[]) Array.newInstance(type, initialCapacity);
		front = 0;
		back = 0;
		
	}
	
	public void enqueue(T newElement,Class <T> type){
		//if(isfull())
		//	doublearray(queue.length*2, type);
		if(!isempty())
		back = (back+1) % queue.length;
		queue[back]= newElement;
	}
	
	public T dequeue(){
		T frontIndex = null;
		if(!isempty()){
			frontIndex= queue[front];
			queue[front] = null;
			front = (front+1) % queue.length;
		}
		return frontIndex;
	}
	
	public void doublearray(int initialCapacity, Class <T> type){
		T[] oldQueue = queue;
		int oldSize = queue.length;
		queue = (T[]) Array.newInstance(type, initialCapacity);
		
		for(int i=0; i<(oldSize-1); i++){
			queue[i] = oldQueue[front];
			front = (front+1) % oldSize;
		}
		front = 0;
		back = oldSize-2;
	}
	
	public boolean isempty(){
		for(T e:queue){
			if(e!=null)
			return false;
		}
		return true;
	}
	
	public boolean isfull(){
		return front == ((back+2) % queue.length);
	}
	
	public void clear(){
		for(int i=0; i<queue.length; i++)
			queue[i]= null;
	}
	
	public int size(){
		int size = back - front;
		if(size<0)
			size+= queue.length;
		return size;
	}
	
	@Override
	public String toString() {
		return "CircularArrayQueue [capacity=" + capacity + ", front=" + front
				+ ", back=" + back + ", count=" + count + ", queue="
				+ Arrays.toString(queue) + "]";
	}
	
	public static void main(String[] args){
	/*	CircularArrayQueue<String> station1 = new CircularArrayQueue<String>(7,String.class);
		CircularArrayQueue<String> station2 = new CircularArrayQueue<String>(10,String.class);
		CircularArrayQueue<String> station3 = new CircularArrayQueue<String>(10,String.class);
		CircularArrayQueue<String> train1 = new CircularArrayQueue<String>(40,String.class);
		station1.enqueue("Passenger1", String.class);
		station1.enqueue("Passenger2", String.class);
		station1.enqueue("Passenger3", String.class);
		station1.enqueue("Passenger4", String.class);
		station1.enqueue("Passenger5", String.class);
		station1.enqueue("Passenger6", String.class);
		System.out.println(station1);
		station1.dequeue();
		station1.dequeue();
		station1.dequeue();
		System.out.println(station1);
		station1.enqueue("Passenger7", String.class);
		station1.enqueue("Passenger8", String.class);
		station1.enqueue("Passenger9", String.class);
		System.out.println(station1);*/
		int hash = 0;
		String s="Java";
		int n = s.length();
		int g= 31;
		for(int i=0; i < n; i++)
			hash = g * hash + s.charAt(i);
		System.out.println(hash);
	}

}
