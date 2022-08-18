import java.util.Scanner;

public class CashRegister {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    double price = 0;
    double change = 0;
    double tendered = 0;
    int currency = 0;

    double PENNIES = .01;
    double NICKELS = .05;
    double DIMES = .1;
    double QUARTERS = .25;
    double DOLLARS = 1;
    double FIVES = 5;
    double TENS = 10;
    double TWENTIES = 20;

    double returnChange = tendered - price;
    int dollars = (int)returnChange;
    double coins = returnChange - dollars;



    System.out.println("Purchase price?");
    price = kb.nextDouble();

    System.out.println("How much money was tendered?");
    tendered = kb.nextDouble();

    if (tendered < price){
      System.out.println("The customer underpaid!");
    }
    // request more and create new kb... perhaps create a method to call "how much money..."
    if (tendered == price){
      System.out.println("No change is required.");
    }

    System.out.println("The customer is due: ");


// double data = 3452.345
// int value = (int)data;
    System.out.println("Purchase price?");
    change = kb.nextDouble();


  }
}
//
// In the cash register we will calculate the amount of change returned to
// a customer based on the purchase price and the amount tendered.
// We will also notify the attendant how many of each piece of currency
// ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change
// for the customer. Change should be provided using the largest bill and
// coin denominations as possible. Denominations that are not used should not be displayed.
// //
// Hint: Mod operator
//
// User Story #1
// The user is prompted asking for the price of the item.
//
// User Story #2
// The user is then prompted asking how much money was tendered by the customer.
//
// User Story #3
// Display an appropriate message if the customer provided too little money or the exact amount.
//
// User Story #4
// If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
//
// Grading
// This is a graded project. You are expected to have your project completed by the start of class on Monday morning.
//
// You will be given either a pass or fail based on whether your code works given all of the following test conditions:
//
// Amount: .67, Tendered: .50, Result: Error message
// Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
// Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
// Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
// Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
