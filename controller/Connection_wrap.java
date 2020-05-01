package controller;

import java.sql.*;
import java.lang.ClassNotFoundException;

public class Connection_wrap {
  
  private final Connection conn = null;

  public Connection_wrap (String username, String password) throws SQLException,  ClassNotFoundException {
    
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
    }
    catch (ClassNotFoundException ex) 
    {
      Ex_handler.handle_class_not_found(ex);
    }

    try (Connection new_conn = DriverManager.getConnection("jdbc:oracle:thin:@edgar1.cse.lehigh.edu:1521:cse241", 
              username, password)) {}
    catch (SQLException ex) 
    {
      Ex_handler.handle_sql(ex);
    }

  }
  
  public Connection get_connection (String username, String password) {
    return this.conn;
  }

  public void close_connection () {
    try
    {
      this.conn.close();
    }
    catch (SQLException ex)
    {
      Ex_handler.handle_sql(ex);
    }
  }
}