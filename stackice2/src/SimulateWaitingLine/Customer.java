/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SimulateWaitingLine;

/**
 *
 * @author assiterk
 */
public class Customer {

  private int arrivalTime;
  private int transactionTime;
  private int customerNumber;

  public Customer (int clock,int tTime,int cNumber) {
        arrivalTime = clock;
        transactionTime = tTime;
        customerNumber = cNumber;
  }

  public int getArrivalTime() { return arrivalTime; }
  public int getTransactionTime() { return transactionTime; }
  public int getCustomerNumber() { return customerNumber; }
}