package Lispcalc;




public class LinkedStack<T> implements StackInterface<T> {
  private Node topNode; 
  private int nElements=0;
  
  public LinkedStack() { topNode=null; }
 
  public void push(T newEntry) { 
     Node newNode=new Node(newEntry,topNode); 
     topNode=newNode; 
     nElements++;
  }
  public T pop() { 
     T top = peek(); 
     if (topNode!=null) 
        topNode=topNode.next;
     nElements--;
     return top; 
  }
  public T peek() { 
     T top=null; 
     if (topNode != null) 
        top=topNode.data; 
     return top; 
  }
  public boolean isEmpty() { 
     return topNode == null; 
  }
  public void clear() { 
     topNode = null;
     nElements=0;
  }
  public int size() {
      return nElements;
  }
  
 private class Node {
   private T    data; // entry in list
   private Node next; // link to next node

  private Node(T dataPortion)
  {
   data = dataPortion;
   next = null; 
  } // end constructor
  
  private Node(T dataPortion, Node nextNode)
  {
   data = dataPortion;
   next = nextNode; 
  } // end constructor
  
 } // end Node
 
 public String toString() {
    String s;
    s = "[";
    Node current = topNode;
    while (current != null) {
      s += " " + current.data;
      current = current.next;
    }
    return s + "]";
  }

 public static void main(String[] args) {
     LinkedStack<String> ls = new LinkedStack<String>();
     ls.push(new String("Do"));
     System.out.println(ls);
     ls.push(new String("Rey"));
     System.out.println(ls);
     ls.push(new String("Mi"));
     System.out.println(ls);
     ls.pop();
     System.out.println(ls);
     ls.pop();
     System.out.println(ls);
     ls.pop();
     System.out.println(ls);
 }
}
