package view;

public class Withdraw_deposit_view {
  
  public static void print_Withdraw_deposit_view () {
    System.out.println("------------------------------");
    System.out.println("Would you like to withdraw or deposit?");
    System.out.println("1) Deposit");
    System.out.println("2) Withdraw"); 
    System.out.println("0) Back to main menu");
    System.out.println("------------------------------");
  }

  public static void print_deposit_view() {
    System.out.println("------------------------------");
    System.out.println("Enter your account number");
    System.out.println("------------------------------");
  }

  public static void print_withdraw_view() {
    System.out.println("------------------------------");
    System.out.println("Enter much money would you like to withdraw");
    System.out.println("------------------------------");
  }

}