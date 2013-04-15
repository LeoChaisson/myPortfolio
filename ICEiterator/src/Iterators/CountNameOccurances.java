/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterators;
import SinglyLinkedLists.*;
import java.util.Iterator;

/**
 *
 * @author assiterk
 */
public class CountNameOccurances {
    public static void main(String[] args) {

        LList<String> nameList = new LList<String>();
        nameList.add(new String("Brad"));
        nameList.add(new String("Jane"));
        nameList.add(new String("Bob"));
        nameList.add(new String("Jane"));
        nameList.add(new String("Bette"));
        nameList.add(new String("Brad"));
        nameList.add(new String("Jane"));
        nameList.add(new String("Brenda"));

        Iterator<String> nameIterator=new SeparateIterator<String>(nameList);
        while (nameIterator.hasNext ()) {
            String currentName = nameIterator.next();
            int nameCount = 0;
            Iterator < String > countingIterator = new SeparateIterator < String > (nameList);
            while (countingIterator.hasNext ()) {
                String nextName = countingIterator.next ();
                if (currentName.equals (nextName))
                    nameCount++;
            } // end while
            System.out.println (currentName + " occurs " + nameCount + " times.");
        } // end while
        
       nameList.display();
       
       
    }
}


