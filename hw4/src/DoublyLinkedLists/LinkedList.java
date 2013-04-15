package DoublyLinkedLists;

public class LinkedList <T>{
	private class Node <T>{
		private T element;
		private Node<T> NodePrevious,NodeNext;
		public Node(Node<T> NodeCopy) {
			this.element = NodeCopy.getElement();
			this.NodePrevious = NodeCopy.getNodePrevious();
			this.NodeNext = NodeCopy.getNodeNext();
		}
		public Node(T element, Node<T> NodePrevious, Node<T> NodeNext){
			this.element=element;
			this.NodePrevious = NodePrevious;
			this.NodeNext = NodeNext;
		}
		public T getElement() {
			return element;
		}
		public void setElement(T element) {
			this.element = element;
		}
		public Node<T> getNodePrevious() {
			return NodePrevious;
		}
		public void setNodePrevious(Node<T> nodePrevious) {
			NodePrevious = nodePrevious;
		}
		public Node<T> getNodeNext() {
			return NodeNext;
		}
		public void setNodeNext(Node<T> nodeNext) {
			NodeNext = nodeNext;
		}

	}
	private Node<T> head;
	private int size;
	public LinkedList() {
		size=0;
	}

	public void add(T element) {
		if(head==null) {
			head = new Node<T>(element,null,null);
		}
		else {

			Node<T> myCurrent = head;
			while(myCurrent.getNodeNext()!=null) {
				myCurrent = myCurrent.getNodeNext();
			}
			myCurrent.setNodeNext(new Node<T>(element,myCurrent,null));
		}
		size++;
	}
	public int size(){
		return size;
	}
	public T get(int index){
		if(index>=size() || index<0)
			return null;
		Node<T> myCurrent = head;
		for(int i=0; i<index; i++)
			myCurrent = myCurrent.getNodeNext();

		return myCurrent.getElement();

	}
	public void remove(T element){
		Node<T> myCurrent = head;
		while(myCurrent.getNodeNext()!=null) {
			if(myCurrent.element.equals(element)){
				if(myCurrent== head){
					head= myCurrent.NodeNext;
					head.NodePrevious = null;
				}
				else{

					if (myCurrent.NodePrevious!=null)
						myCurrent.NodePrevious.NodeNext = myCurrent.NodeNext;

					if (myCurrent.NodeNext!=null)
						myCurrent.NodeNext.NodePrevious = myCurrent.NodePrevious;
					myCurrent = null;
				}
				size--;
				return;
			}
			myCurrent=myCurrent.getNodeNext();
		}
	}
	public boolean contains(T element){
		Node<T> myCurrent = head;
		for(int i=0; i<size(); i++){
			myCurrent = myCurrent.getNodeNext();
			if(myCurrent.element == element) 
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String temp = "size=" + size;
		Node<T> myCurrent = head;
		while(myCurrent!=null) {
			temp += myCurrent.getElement().toString();
			myCurrent = myCurrent.getNodeNext();
		}
		temp += "]";
		return temp;
	}

}
