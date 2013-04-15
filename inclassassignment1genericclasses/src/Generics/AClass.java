package Generics;

public class AClass<T>{
	  private T data;
	  public AClass(T inA){ data=inA; }
	  public T getA() { return data; }
	  public void setA(T inA) { data=inA; }
	  public String toString() { return "data " + data; }

	  public static void main(String[] args) {
	      AClass<Integer> myData = new AClass<Integer>(100);
	      AClass myAClass = new AClass(myData);
	      System.out.println(myAClass);
	  }
	}
