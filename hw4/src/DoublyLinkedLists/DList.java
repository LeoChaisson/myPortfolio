package DoublyLinkedLists;

/** Doubly linked list with nodes of type DNode storing strings. */
public class DList <T> {

	protected int size;   // number of elements
	protected DNode<T> header, trailer; // sentinels

	/** Constructor that creates an empty list */
	public DList() { 
		size = 0;
		header = new DNode<T>(null, null, null); // create header
		trailer = new DNode<T>(null, header, null); // create trailer
		header.setNext(trailer); // make header and trailer point to each other
	}

	/** Returns the number of elements in the list */
	public int size() { return size; }

	/** Returns whether the list is empty */
	public boolean isEmpty() { return (size == 0); }
	/** Returns the first node of the list */

	public DNode<T> getFirst() throws IllegalStateException {
		if (isEmpty()) throw new IllegalStateException("List is empty");
		return header.getNext();
	}

	/** Returns the last node of the list */
	public DNode<T> getLast() throws IllegalStateException {
		if (isEmpty()) throw new IllegalStateException("List is empty");
		return trailer.getPrev();
	}

	/** Returns the node before the given node v. An error occurs if v
	 * is the header */
	public DNode<T> getPrev(DNode v) throws IllegalArgumentException {
		if (v == header) throw new IllegalArgumentException
		("Cannot move back past the header of the list");
		return v.getPrev();
	}

	/** Returns the node after the given node v. An error occurs if v
	 * is the trailer */
	public DNode<T> getNext(DNode<T> v) throws IllegalArgumentException {
		if (v == trailer) throw new IllegalArgumentException
		("Cannot move forward past the trailer of the list");
		return v.getNext();
	}

	public T get(int index) {
		if (index>=size())
			return null;
		
		DNode<T> node = header;
		for (int i=0;i<index;i++)
			node = node.getNext();
		
		return node.getElement();
	}
	
	public void set(int index, T element) {
		if (index>=size())
			return;
		
		DNode<T> node = header;
		
		for (int i=0;i<index-1;i++)
			node = node.getNext();
		
		node.setElement(element);
	}

	/** Inserts the given node z before the given node v. An error
	 * occurs if v is the header */
	public void addBefore(DNode<T> v, DNode<T> z) throws IllegalArgumentException {
		DNode u = getPrev(v); // may throw an IllegalArgumentException
		z.setPrev(u);
		z.setNext(v);
		v.setPrev(z);
		u.setNext(z);
		size++;
	}

	/** Inserts the given node z after the given node v. An error occurs
	 * if v is the trailer */
	public void addAfter(DNode<T> v, DNode<T> z) {
		DNode w = getNext(v); // may throw an IllegalArgumentException
		z.setPrev(v);
		z.setNext(w);
		w.setPrev(z);
		v.setNext(z);
		size++;
	}

	/** Inserts the given node at the head of the list */
	public void addFirst(DNode<T> v) {
		addAfter(header, v);
	}

	/** Inserts the given node at the tail of the list */
	public void addLast(DNode<T> v) {
		addBefore(trailer, v);
	}

	/** Removes the given node v from the list. An error occurs if v is
	 * the header or trailer */
	public void remove(DNode<T> v) {
		DNode<T> u = getPrev(v); // may throw an IllegalArgumentException
		DNode<T> w = getNext(v); // may throw an IllegalArgumentException
		// unlink the node from the list 
		w.setPrev(u);
		u.setNext(w);
		v.setPrev(null);
		v.setNext(null);
		size--;
	}
	public void removeFirst() {
		this.header = null;
		
	}
	

	/** Returns whether a given node has a previous node */
	public boolean hasPrev(DNode<T> v) { return v != header; }

	/** Returns whether a given node has a next node */
	public boolean hasNext(DNode<T> v) { return v != trailer; }

	/** Returns a string representation of the list */
	public String toString() {
		String s = "[";
		DNode<T> v = header.getNext();
		while (v != trailer) {
			s += v.getElement();
			v = v.getNext();
			if (v != trailer)
				s += ",";
		}
		s += "]";
		return s;
	}

	public void add(T E){
		addFirst(new DNode<T>(E,null,null));

	}
	/***********************************************************************
	 * Insertion-sort for a doubly linked list of class DList.  
	 **********************************************************************/

	/*public static void sort(DList<T> L) {
    if (L.size() <= 1) 
      return; // L is already sorted in this case
    DNode pivot; // pivot node 
    DNode ins;  // insertion point 
    DNode end = L.getFirst(); // end of run

    while (end != L.getLast()) {
      pivot = end.getNext(); // get the next pivot node
      L.remove(pivot);  // remove it
      ins = end;  // start searching from the end of the sorted run

      while (L.hasPrev(ins) && ins.getElement().compareTo(pivot.getElement()) > 0)
        ins = ins.getPrev(); // move left

      L.addAfter(ins,pivot); // add the pivot back, after insertion point
      if (ins == end)  // we just added pivot after end in this case
        end = end.getNext(); // so increment the end marker
    }
  }*/


	/**************************************
	 * Test the class before we use it.. *
	 *************************************/
	/*
  public static void main(String args[]) {

    DList myDList = new DList();
    myDList.addFirst(new DNode("first node added",null,null));
    myDList.addFirst(new DNode("second node added",null,null));
    System.out.println("List before insertion sort: " + myDList);   

    DList.sort(myDList);
    System.out.println("List after insertion sort: " + myDList);

  }*/

}