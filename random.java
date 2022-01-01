
/**
 * Write a description of class random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.*;
import java.util.Scanner;
import java.util.Random;
public class random
{
    public static void main(){
    int low;
    int high;
    
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter Low");
     low = scnr.nextInt();
     System.out.println("Enter Low: "+low);
     System.out.println("Enter High");
     high = scnr.nextInt();
     System.out.println("Enter High: "+ high);
     Random numran = new Random();
     for (int i=0; i<3; i++){
     int randomNum = numran.nextInt(high+1);
     System.out.println(randomNum);
    }
    }
}