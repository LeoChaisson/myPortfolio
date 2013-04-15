package Lispcalc;

//Takes an expression in lisp notation and converts it to infix
public class Lispcalc<E> extends ArrayStack<E>
{
public static String convertToInfix(String lisp){
	StringBuilder infix = new StringBuilder();
	StackInterface<Character> stack = new ArrayStack<Character>();
	int charCount = lisp.length();
	String a;
	String lastChar;
	char topOperator;
	
	for(int i=0; i<charCount; i++){
		char nextChar = lisp.charAt(i);
    	if (nextChar=='(')
        infix= infix.append(nextChar);
    	else{
    		switch(nextChar){
    		case '+':case'*':case'/':case '-':
    			stack.push(nextChar);
    			break;
    		case ')':
    			infix= infix.append(nextChar);
    			topOperator = stack.pop();
    			if(stack.isEmpty())
    				break;
    			else
    			topOperator = stack.peek();
    			infix = infix.append(topOperator);
    			break;
    		case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':
    			topOperator = stack.peek();
    			lastChar = infix.substring(infix.length()-1, infix.length());
    			System.out.println("last char:" + lastChar);
    			if(lastChar.equals("(") && topOperator!='-'){
    			infix = infix.append(nextChar);
    			break;
    			}
    			else {
    			infix = infix.append(topOperator);
    			infix = infix.append(nextChar);
    			break;
    			}
    		}
    		System.out.println(stack);
    		System.out.println(infix);
    	}
    	
	}
	a = infix.substring(0, infix.length()-2);
	a += ")";
	return a;
}

public static void main(String[] args){
System.out.println(convertToInfix("(+(-6)(*234)(/312))"));
System.out.println(convertToInfix("(*(+64)(-73)(/822))"));
System.out.println(convertToInfix("(-(*354)(+23)(/63))"));
}
} 