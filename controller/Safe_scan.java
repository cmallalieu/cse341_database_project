package controller;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Safe_scan {

  private Scanner scan;

  public Safe_scan() {
    this.scan = new Scanner (System.in);
  }



  public int next_int_safe () {
    
    System.out.println("Please enter an integer: ");
    int input = 0;
    try 
    {
        input = this.scan.nextInt();
    } 
    catch (InputMismatchException ex) 
    {
        Ex_handler.handle_input_mismatch(ex, "int");
        this.scan.next();
        return next_int_safe();
    }
    return input;
  }

  public String next_string_safe() {
    System.out.println("Please enter a word");
    return this.scan.next();
  }

  public boolean next_yes_no_safe() {
    
    System.out.println("Please enter 'Y' for yes or 'N' for no");
    String input = this.scan.next();

    System.out.println(input);

    if (input.equals("Y") || input.equals("y"))
    {
      return true;
    }
    else if (input.equals("N") || input.equals("n"))
    {
      return false;
    }
    else
    {
      return next_yes_no_safe();
    }
  }

  public double next_double_safe() {
    System.out.println("Please enter a number: ");

    double input = 0.0;
    try 
    {
      input = this.scan.nextDouble();
    } 
    catch (InputMismatchException ex) 
    {
        Ex_handler.handle_input_mismatch(ex, "double");
        this.scan.next();
        return next_double_safe();
    }
    return input;
  }

  public double next_positive_double_safe() {
    
    double input = -1.0;
    System.out.println("Please enter a positive number");
    
    try 
    {
        input = this.scan.nextDouble();
        if (input < 0.0) 
        {
            System.out.println("You did not enter a positive number");
            return next_positive_double_safe();
        }
    } 
    catch (InputMismatchException ex) 
    {
        Ex_handler.handle_input_mismatch(ex, "double pos");
        this.scan.next();
        return next_positive_double_safe();
    }
    return input;
  }
}