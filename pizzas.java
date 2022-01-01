
/**
 * Write a description of class pizzas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    import java.text.*;
import java.util.Scanner;
import java.util.Currency;
import java.util.Locale;
public class pizzas
{
    public static void main(){
     NumberFormat usd = NumberFormat.getCurrencyInstance(Locale.US);
     int pizzas;
     double costPizzas = 9.99;
     double subtotal;
     double totaltot;
     Scanner scnr = new Scanner(System.in);
     System.out.println("Enter number of pizzas");
     pizzas = scnr.nextInt();
     subtotal = costPizzas * pizzas;
     System.out.println("Sub Total: "+ usd.format(subtotal));
     totaltot = subtotal * 1.06;
     System.out.println("Total Due: "+ usd.format(totaltot));
    }
}
