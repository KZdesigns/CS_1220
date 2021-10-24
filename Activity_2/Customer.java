 /**
* Customer - working with implementation interfaces and overload methods.
* Activity 2
* @author Kyle Zimmerman - CS 1220
* @version 10/20/2021
*/

public class Customer implements Comparable<Customer> {

   private String name, location;
   private double balance;
   
   /**
   Constructor method creates an instance of custoemr.
   @param nameIn representing the name of the customer.
   */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
   setLocation takes in a string and sets customer location.
   @param locationIn represents the location assigned to the customer.
   */
   public void setLocation(String locationIn) {
   
      location = locationIn;
   }
   
   /**
   cahngeBalance add the amount to the customers balance.
   @param amount represents the amount to be added to the current bal.
   */
   public void changeBalance(double amount) {
   
      balance = balance + amount;
   }
   
   /**
   getLocation returns the location variable.
   @return the location string value.
   */
   public String getLocation() {
      
      return location;
   }
   
   /**
   getBalance returns a the balance of the customer.
   @return the customer's balance.
   */
   public double getBalance() {
      
      return balance;
   }
   
   /**
   setLocation override method that takes in city and state.
   @param city string represents the city of the customer.
   @param state string represents the state of the customer.
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
   toString prints a string representing the customer.
   @return output string representing the customer.
   */
   public String toString() {
      String output = "";
         
      output = name + "\n"
            + location + "\n"
            + "$" + balance;
            
      return output;
      
   }
   
   /**
   compareTo method for using compare interface.
   @param obj object to compare.
   @return an int representing the comparison.
   */
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      } else if (this.balance < obj.getBalance()) {
         return -1;
      } else {
         return 1;
      }
   }
}