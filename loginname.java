
/**
 * Write a description of class loginname here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.*;

import java.util.Scanner;
public class loginname
{
    
    
    public static void main(){
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;
        int number;
      //System.out.println("Enter your first name");
      firstName = scnr.next();
      //System.out.println("Enter first name: " + firstName);
     // System.out.println("Enter your last name");
      lastName = scnr.next();
      //System.out.println("Enter last name: " + lastName);
      //System.out.println("Enter four digits");
      number = scnr.nextInt();
      //System.out.println("Enter four digits: " + number);
      System.out.println("Your login name: "+lastName.substring(0,5)+firstName.substring(0,1)+number%100);
    }    
}

