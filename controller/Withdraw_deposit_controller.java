package controller;

import model.*;
import java.sql.*;

public class Withdraw_deposit_controller {
  
  public static void withdraw_from_db (Connection conn, int acct_num, double amount) {

    PreparedStatement check__saving_hasTeller = conn.PreparedStatement("select has_teller from branch where branch_id ="
                                                +  "(select branch_id from savings_account where acct_id = ?)");
    check__saving_hasTeller.setString(1, String.valueOf(acct_num));
    String has_teller = Withdraw_deposit_model.check_has_teller(check__saving_hasTeller);
    
    System.out.println(has_teller);
   
  }

  public static void deposit_in_db (Connection conn, int acct_num, double amount) {

  }
}