
/**
 * Write a description of class triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    import java.text.*;
import java.util.Scanner;
public class triangle
{
        public static void main(){
        
        Scanner scnr = new Scanner(System.in);
        double side1;
        double side2;
        double side3;
        double area;
        double totperimeter;
        DecimalFormat shapestatsFmt =  new DecimalFormat ("0.000");
        DecimalFormat statsFmt =  new DecimalFormat ("0");
      
     System.out.println("Enter Side A");
     side1 = scnr.nextDouble();
     System.out.println("Enter Side A: "+statsFmt.format(side1));
     System.out.println("Enter Side B");
     side2 = scnr.nextDouble();
     System.out.println("Side B: "+ statsFmt.format(side2));
      System.out.println("Enter Side C");
     side3 = scnr.nextDouble();
     System.out.println("Side C: "+statsFmt.format(side3));
     totperimeter = (side1+ side2+ side3)/2;
     area = Math.sqrt(totperimeter*(totperimeter-side1)*(totperimeter-side2)*(totperimeter-side3));
     System.out.println("The area of the triangle is: "+ shapestatsFmt.format(area));
    
}
}

