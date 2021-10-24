 /**
* BankLoan - working with static variables and methods, and JUnit.
* Activity 1
* @author Kyle Zimmerman - CS 1220
* @version 10/13/2021
*/
 
public class BankLoan {

	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   
   private static int loansCreated = 0;
   
   /**
   isAmountValid returns a boolean indicated whether the amount is valid.
   @param amount indicates the amount of the loan.
   @return boolean idicating a valid input amount.
   */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
   isInDebt returns a boolean indicating whether the loan is greater then zero.
   @param loan the loan object passed into the class method.
   @return boolean indicating whether the loan is greater then zero.
   */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
   getLoansCreated is a class method to return the value of loansCreated.
   @return the value associated with loansCreated.
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
   resetLoansCreated is a class method to reset the loansCreated count to zero.
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   /**
   BankLoan constructor method for BankLoan object.
   @param customerNameIn value representing the customer name.
   @param interestRateIn value representing the interest rate for the loan.
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
   borrowFromBank instance method to set the amount barrowed.
   @param amount indicates the amount borrowed from the bank.
   @return boolean inidcating whether the action was successful or not.
   */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
   payBank instance method representing a loan payment made.
   @param amountPaid double value representing the payment amount.
   @return a double representing the new loan balance.
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   getBalance getter method for the balance field.
   @return double value represnting the balance.
   */
   public double getBalance() {
      return balance;
   }
   
   /**
   setInterestRate setter method in order to insure valid interest rate.
   @param interestRateIn represents the interest rate passed from contructor.
   @return boolean value indicated successful or not.
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   getInterestRate getter method the interest rate of the loan.
   @return double value representing the interest rate.
   */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   chargeInterest increase the loan balance by the amount of interest charged.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   toString method used for printing the BankLoan object.
   @return a customer string representing the BankLoan.
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
