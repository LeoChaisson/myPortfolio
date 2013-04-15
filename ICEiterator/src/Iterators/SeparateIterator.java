/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterators;

/**
 *
 * @author assiterk
 */
import SinglyLinkedLists.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class SeparateIterator < T > implements Iterator < T > {
    private ListInterface< T > list;
    private int nextPosition; // position of entry last returned by next()
    private boolean wasNextCalled; // needed by remove
    public SeparateIterator (ListInterface < T > aList)
    {
        list = aList;
        nextPosition = 0;
        wasNextCalled = false;
    } // end constructor
    public boolean hasNext ()
    {
        return nextPosition < list.getLength ();
    } // end hasNext

    public T next ()
    {
        if (hasNext ())
        {
            wasNextCalled = true;
            nextPosition++;
            return list.getEntry (nextPosition);
        }
        else
            throw new NoSuchElementException ("Illegal call to next(); " +
                    "iterator is after end of list.");
    } // end next


    public void remove ()
    {
        if (wasNextCalled)
        {
            // nextPosition was incremented by the call to next(), so
            // it is the position number of the entry to be removed
            list.remove (nextPosition);
            nextPosition--; // a subsequent call to next() must be
            // unaffected by this removal
            wasNextCalled = false; // reset flag
        }
        else
            throw new IllegalStateException ("Illegal call to remove(); " +
                    "next() was not called.");
    } // end remove

    
}
