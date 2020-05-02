package model;

import java.sql.*;
import utilities.*;

public class Withdraw_deposit_model {
  
  public static String check_has_teller(PreparedStatement query) {

    String res = null;

    try {
      ResultSet result = query.executeQuery();

      if (!result.next())
      {
        return "Not found";
      }
      else if (result.getString("has_teller").equals("1"))
      {
        return "1";
      }
      else
      {
        return "0";
      }
    }
    catch (SQLException ex)
    {
      Ex_handler.handle_sql(ex);
    }
    return "";
    
    // if (!result.next())
    // {
    //   PreparedStatement query = conn.PreparedStatement("select has_teller from branch where branch_id =" 
    //                                               + "(select branch_id from checking_account where acct_id = ?)");
    //   query.update(1, acct_num);
    //   ResultSet result = query.executeQuery();
    //   if (!result.next())
    //   {
    //     res = "Not found";
    //     return res;
    //   }
    //   else
    //   {
    //     if (result.getString("has_teller").equals("1"))
    //     {
    //       return "checking 1";
    //     }
    //     else
    //     {
    //       return "checking 0";
    //     }
    //   }
    // }
    // else
    // {
    //   if (result.getString("has_teller").equals("1"))
    //   {
    //     return "savings 1";
    //   }
    //   else
    //   {
    //     return "savings 0";
    //   }
    // }
  }

  public static void withdraw (PreparedStatement query) {

  } 
}