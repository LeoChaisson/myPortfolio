package Lispcalc;


public class ArrayStack<E> implements StackInterface<E> {

  protected int capacity;   
  public static final int CAPACITY = 1000; 
  protected E S[];                         
  protected int top = -1;                    
  

  public ArrayStack() {
    this(CAPACITY);                          
  }
  
  @SuppressWarnings("unchecked")
public ArrayStack(int cap) {
    capacity = cap;
    S = (E[]) new Object[capacity];
  }
  
  public int size() { 
    return (top + 1);
  }
 
  public boolean isEmpty() {
    return (top < 0);
  }

  public void push(E element)  {
    if (size() != capacity)
       S[++top] = element;
  }
  
  public E peek()  {
    if (isEmpty()) return null;
    
    return S[top];
    }
  public E pop()  {
    E element;
    if (isEmpty()) return null; 
    
    element = S[top];
    S[top--] = null;
    return element;
  }
  public String toString() {
    String s;
    s = "[";
    if (size() > 0) s+= S[0];
    if (size() > 1)
      for (int i = 1; i <= size()-1; i++) {
      s += ", " + S[i];
      }
    return s + "]";
  }
 /* public static void main(String args[]) {
    
    ArrayStack<Integer>  iStack = new ArrayStack<Integer>();
    iStack.push(8);
    iStack.push(9);
    iStack.push(9);
    iStack.push(80);
    iStack.push(6);
    iStack.push(1);
    iStack.push(24);
    System.out.println("~~~~~Stack of Integers~~~~~");
    System.out.println("Stack: " + iStack);
    System.out.println("Popped top element: " + iStack.pop());
    System.out.println("Peeked top element: " + iStack.peek());
    System.out.println("Popped top element: " + iStack.pop());
    System.out.println("Stack: " + iStack);
    iStack.push(4);
    iStack.push(5);
    iStack.push(72);
    System.out.println("Stack: " + iStack);
    System.out.println("Popped top element: " + iStack.pop());
    System.out.println("Popped top element: " + iStack.pop());
    System.out.println("Popped top element: " + iStack.pop());
    System.out.println("Stack: " + iStack);
    System.out.println("~~~~~Stack of Strings~~~~~");
    ArrayStack<String> sStack = new ArrayStack<String>();
    sStack.push(new String("Hello1"));
    System.out.println("Stack: " + sStack);
    
    sStack.push(new String("Hello2"));
    System.out.println("Stack: " + sStack);
    
    sStack.push(new String("Hello3"));
    System.out.println("Stack: " + sStack);
    while (!sStack.isEmpty()) {
         System.out.println("Popped top element: " + sStack.pop());
    }
    
  }*/
    
}
