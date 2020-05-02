package controller;

import java.io.*;
import java.sql.*;


public class Controller {
    // // establish connection and get query string
    // Connection con = ensure_connection();
    // String query_str = get_dept_query();
    // String dept_name = get_input_string();

    // // create prepared statement to prevent sql injection
    // PreparedStatement query = con.prepareStatement(query_str);
    // query.setString(1, dept_name);

    // try 
    // {
    //   Class.forName("oracle.jdbc.driver.OracleDriver");

    //   // execute query in oracle
    //   ResultSet result = query.executeQuery();

    //   // if there resultset is empty re-query for all instructors in dept
    //   if (!result.next())
    //   {
    //     System.out.println ("Empty result Set, Printing All Instructors in the Dept: ");
    //     String new_query = get_dept_instructors();
    //     query = con.prepareStatement(new_query);
    //     query.setString(1, dept_name);

    //   }
    //   // if the query resultset is not empty, print the results
    //   else
    //   {
    //     pprint_dept_advisors(result);
    //   } 

    // }
    // // catch exception thrown if the db driver is not properly installed
    // catch (ClassNotFoundException e) 
    // {
    //   System.out.println("Could not find the database driver " + e.getMessage());
    // }
    // catch (SQLException e)
    // {
    //   handle_sql(e);
    // }
    // // release resources at end of execution
    // finally 
    // {
    //   query.close();
    //   con.close();
    // }
  //}

  /*
  * METHODS FOR GETTING USER INPUT
  */

  // gets user input string from command line
  // public static String get_input_string() {

  //   Scanner scan = new Scanner(System.in);
  //   return scan.nextLine();

  // }

  // /*
  // * METHODS FOR ENSURING THE USERNAME AND PASSWORD IS INPUT CORRECTLY
  // */

  // // wrapper class to reprompt try_connection until it is successful
  // public static Connection ensure_connection()
  // {
  //   Connection con = null;
  //   // continue to call try_connection until connection is successful
  //   while ((con = try_connection()) == null)
  //   {
  //     System.out.println("Invalid Login Credentials");
  //   }
  //   System.out.println("\nConnection Successfully Made!\n");
  //   return con;
  // }

  // // attempt to connect to the database
  // public static Connection try_connection () {

  //   Connection con = null;

  //   System.out.println("Please Enter Your Oracle Username: ");
  //   String user = get_input_string(); //cpm220

  //   System.out.println("Please Enter Your Oracle Password: ");
  //   String pass = get_input_string(); //test1234

  //   try
  //   {
  //     con = DriverManager.getConnection
  //       ("jdbc:oracle:thin:@edgar1.cse.lehigh.edu:1521:cse241", user, pass);
  //   }
  //   // catch exceptions thrown by oracle db
  //   catch (SQLException e) 
  //   {
  //     handle_sql(e);
  //   }
    
  //   return con;
  // }

  // /*
  // * METHODS FOR HANDLING EXCEPTIONS
  // */

  // public static void handle_sql (SQLException e) {

  //   while (e != null) 
  //   {
  //     // get and print possibly many error messages
  //     String errMsg = e.getMessage();
  //     System.out.println("SQL Error Message: " + errMsg);

  //     int errorCode = e.getErrorCode();
  //     System.out.println("SQL Error Code: " + errorCode);

  //     String sqlState = e.getSQLState();
  //     System.out.println("SQL State: " + sqlState);

  //     // uncomment for debugging
  //     //e.printStackTrace();

  //     e = e.getNextException();
  //   }
  // }

  // /*
  // * METHODS FOR GETTING SQL QUERY STRINGS
  // */

  // public static String get_dept_query() {

  //   System.out.println("Please Enter the Department Name: ");

  //   String query = "SELECT unique instructor.ID instructorID, instructor.name instructorName, student.ID adviseeID, student.name adviseeName " +
  //                                 "FROM student natural join advisor, instructor " +
  //                                 "WHERE instructor.dept_name = ?" +
  //                                   " and instructor.ID = advisor.i_id " +
  //                                   "and student.ID = advisor.s_id " +
  //                                 "ORDER BY instructor.ID ASC, student.ID ASC";
  //   return query;
  // }

  // public static String get_dept_instructors() {
  //   // get all instructors for a give dept name
  //   String query = "SELECT ID, name " +
  //                     "FROM instructor " +
  //                     "where dept_name = ?";
  //   return query;
  // }

  // /*
  // * METHODS FOR PRETTY PRINTING QUERY RESULTS
  // */

  // public static void pprint_dept_advisors(ResultSet result) {

  //   try
  //   {
  //     // format and pretty print output
  //     System.out.println("\n\n");
  //     System.out.println(String.format("%-15s %-15s %-15s %-15s", "instructorID", "instructorName", "adviseeId", "adviseeName"));
  //     System.out.println("------------------------------------------------------------");
  //     do 
  //     {
  //       // get information from rows in returned relation
  //       String instructorId = String.format("%-15s", result.getString("instructorID"));
  //       String instructorName = String.format("%-15s", result.getString("instructorName"));
  //       String adviseeId = String.format("%-15s", result.getString("adviseeId"));
  //       String adviseeName = String.format("%-15s", result.getString("adviseeName"));

  //       System.out.println (instructorId + " " + instructorName + " " +
  //                             adviseeId + " " + adviseeName);
  //     // keep printing rows until end of relation
  //     } while (result.next());
  //   }
  //   catch (SQLException e)
  //   {
  //     handle_sql(e);
  //   }
    
  // }

  // // pretty print result of all instructors in dept query
  // public static void pprint_dept_instructors (ResultSet result) {
  //   try
  //   {
  //     System.out.println("\n\n");
  //     System.out.println(String.format("%-15s %-15s", "instructorID", "instructorName"));
  //     System.out.println("------------------------------");

  //     do
  //     {
  //       // get information from rows in returned relation
  //       String instructorId = String.format("%-15s", result.getString("instructorID"));
  //       String instructorName = String.format("%-15s", result.getString("instructorName"));

  //       System.out.println (instructorId + " " + instructorName);
  //       // keep printing rows until end of relation
  //     } while (result.next());
  //   }
  //   catch (SQLException e)
  //   {
  //     handle_sql(e);
  //   }
  // }
}
