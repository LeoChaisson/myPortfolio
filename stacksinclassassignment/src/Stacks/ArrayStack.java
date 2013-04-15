package Stacks;


/***************************************************************************
  * Array Stack
  *   Modified version of source provided with text.
  **************************************************************************/

public class ArrayStack<E> implements StackInterface<E> {

  protected int capacity;                      // The actual capacity of the stack array
  public static final int CAPACITY = 1000;     // default array capacity
  protected E S[];                             // Generic array used to implement the stack 
  protected int top = -1;                      // index for the top of the stack
  
  // **************************************
  // Constructors 
  // **************************************
  public ArrayStack() {
    this(CAPACITY);                            // default capacity 
  }
  
  public ArrayStack(int cap) {
    capacity = cap;
    S = (E[]) new Object[capacity]; // compiler may give warning, but this is ok
  }
  
  // **************************************
  // SIZE 
  // **************************************
  public int size() { 
    return (top + 1);
  }
  
  // **************************************
  // isEmpty
  // **************************************
  public boolean isEmpty() {
    return (top < 0);
  }
  
  // *******************************************
  // PUSH - Put something on top of the stack
  // *******************************************
  public void push(E element)  {
    if (size() != capacity)
       S[++top] = element;
  }
  
  // *******************************************
  // TOP - REturn top element but dont remove
  // *******************************************
  public E peek()  {
    if (isEmpty()) return null;
    
    // Not empty...
    return S[top];
    }
  
  // *******************************************
  // POP -  remove and return top element
  // *******************************************
  public E pop()  {
    E element;
    if (isEmpty()) return null; 
    
    // Not empty
    element = S[top];
    S[top--] = null;                       // dereference S[top] for garbage collection.
    return element;
  }
  
  // *******************************************
  // toString - Display stack
  // *******************************************
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

  
  // *******************************************
  //  Main - Test array stack 
  // *******************************************
  
  public static void main(String args[]) {
    
    // Create a stack for integers
    ArrayStack<Integer>  iStack = new ArrayStack<Integer>();
    iStack.push(8);
    iStack.push(9);
    System.out.println(iStack);
    System.out.println(iStack.pop());
    System.out.println(iStack.pop());
    System.out.println(iStack);
    
    ArrayStack<String> sStack = new ArrayStack<String>();
    sStack.push(new String("s1"));
    System.out.println(sStack);
    
    sStack.push(new String("s2"));
    System.out.println(sStack);
    
    sStack.push(new String("s3"));
    System.out.println(sStack);
    while (!sStack.isEmpty()) {
         System.out.println(sStack.pop());
    }
    
  }
    
}
