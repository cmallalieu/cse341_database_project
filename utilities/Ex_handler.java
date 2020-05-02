package utilities;

import java.lang.ClassNotFoundException;
import java.sql.SQLException;
import java.util.InputMismatchException;


public class Ex_handler {
  
  private Ex_handler () {}

  public static void handle_sql (SQLException ex) {
    
    while (ex != null) 
    {
      // get and print possibly many error messages
      String errMsg = ex.getMessage();
      if (errMsg.contains("ORA-01017"))
      {
        System.out.println("Invalid Username/Password");
      }
 

      // uncomment for debugging
      //e.printStackTrace();

      ex = ex.getNextException();
    }
  }

  // on class not found exception, print error
  public static void handle_class_not_found (ClassNotFoundException ex) {
    System.out.println("Could not find the database driver " + ex.getMessage());
  }

  // parse the kind of input mismatch and print correct error
  public static void handle_input_mismatch (InputMismatchException ex, String kind) {
    if (kind.equals("int"))
    {
      System.out.println("You did not enter an integer");
    }
    else if (kind.equals("double"))
    {
      System.out.println("You did not enter a number");
    }
    else if (kind.equals("double pos"))
    {
      System.out.println("You did not enter a positive number");
    }
    else
    {
      System.out.println("Incorrect input");
    }
  }
}