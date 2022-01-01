
/**
 * Write a description of class cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.*;
import java.util.Scanner;
public class cylinder
{
        public static void main(){
        
        Scanner scnr = new Scanner(System.in);
        double radius;
        double height;
        int number;
        double surfaceArea;
        double volume;
        DecimalFormat shapestatsFmt =  new DecimalFormat ("0.0");
      
     System.out.println("Enter radius");
     radius = scnr.nextDouble();
     System.out.println("Radius: "+radius);
     System.out.println("Enter height");
     height = scnr.nextDouble();
     System.out.println("Height: "+height);
     volume = Math.PI*Math.pow(radius, 2.0)*height;
     System.out.println("Volume: "+ shapestatsFmt.format(volume) + " cubic inches");
     surfaceArea = 2*Math.PI*radius*height;
     System.out.println("Surface Area: "+ shapestatsFmt.format(surfaceArea)+ " square inches");
}
}