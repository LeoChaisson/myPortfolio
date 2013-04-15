/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedLists;

/**
 *
 * @author assiterk
 */
public class ListClient {
   public static void main(String[] args) { 
      testList();
    }
    public static void testList() {
       ListInterface<String> runnerList = new LList<String>();
       runnerList.add("16");
       runnerList.add("04");
       runnerList.add("33");
       runnerList.add("27");
       displayList(runnerList);
    }
    public static void displayList(ListInterface<String> list) {
       int numberOfEntries = list.getLength();
       System.out.println("List has: "+numberOfEntries+ " entries:");
       for (int position = 1;position <= numberOfEntries;position++)
         System.out.println(list.getEntry(position)+" is at " + position);
       System.out.println();
    }
}
