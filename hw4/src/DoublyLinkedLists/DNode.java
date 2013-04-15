package DoublyLinkedLists;
/** Node of a doubly linked list of Ts */
public class DNode <T> {
  protected T element; // T element stored by a node
  protected DNode<T> next, prev; // Pointers to next and previous nodes
  /** Constructor that creates a node with given fields */
  public DNode(T e, DNode<T> p, DNode<T> n) {
    element = e;
    prev = p;
    next = n;
  }
  /** Returns the element of this node */
  public T getElement() { return element; }
  /** Returns the previous node of this node */
  public DNode<T> getPrev() { return prev; }
  /** Returns the next node of this node */
  public DNode<T> getNext() { return next; }
  /** Sets the element of this node */
  public void setElement(T newElem) { element = newElem; }
  /** Sets the previous node of this node */
  public void setPrev(DNode<T> newPrev) { prev = newPrev; }
  /** Sets the next node of this node */
  public void setNext(DNode<T> newNext) { next = newNext; }
  
  public T toT() {
    return element;
  }
  /*
  public static void main(String args[]) {
        DNode myNode = new DNode("Hi with toT",null,null);
        System.out.println(myNode);
  }*/
  
}
