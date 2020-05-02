import view.*;
import controller.*;
import utilities.*;

import java.sql.*;

public class Main {
  public static void main (String[] arg) {

      try
      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
      }
      catch (ClassNotFoundException ex) 
      {
        Ex_handler.handle_class_not_found(ex);
      }
  
      Safe_scan scan = new Safe_scan();
  
      System.out.println("Enter your username");
      String username = scan.next_string_safe();
      System.out.println("Enter your password");
      String password = scan.next_string_safe();
  
      try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@edgar1.cse.lehigh.edu:1521:cse241",
                                                username, password))
      {
        boolean finished = false;
          do
          {
            Main_view.print_main_view();
            int int_input = scan.next_int_safe();
            double double_input = 0.0;
            String string_input = "";

            switch (int_input)
            {
              case 1: Withdraw_deposit_view.print_Withdraw_deposit_view();
                      int_input = scan.next_int_safe();
                      switch (int_input)
                      {
                        case 0: break;
                        case 1: Withdraw_deposit_view.print_deposit_view(); 
                                int acct_num = scan.next_positive_int_safe();
                                System.out.println("Enter how much you would like to deposit");
                                double amount = scan.next_positive_double_safe();
                                //Withdraw_deposit_controller.deposit_in_db(conn, acct_num, amount);
                                break;
                        case 2: Withdraw_deposit_view.print_withdraw_view();
                                acct_num = scan.next_positive_int_safe();
                                System.out.println("Enter how much you would like to withdraw");
                                amount = scan.next_positive_double_safe();
                                //Withdraw_deposit_controller.withdraw_from_db(conn, acct_num, amount);
                                break;
                        default: System.out.println("Not a valid option, returning to main menu"); break;
                      }
                      break;
              case 0: System.out.println("Goodbye!");
                      finished = true; break;
            }
          }
          while (finished == false);
      }
      catch (SQLException ex)
      {
        Ex_handler.handle_sql(ex);
      }
  }
}
