package Lispcalc;


public interface StackInterface<E> {

  public int size();
 
  public boolean isEmpty();
 
  public E peek();
 
  public void push (E element); 
 
  public E pop();
}