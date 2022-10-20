//Kevin Kelly
// Tip or tax calculator
import java.util.*;



public class calculator
{
    public static void main(String[] args)
    {
    double total;
    double tip;
    double tipRatio;
    double finalTotal;
    double taxRate;
    double taxRatio;
       
        Scanner ScanNa = new Scanner(System.in);

        System.out.println("Enter total: $");

        total = ScanNa.nextDouble();

        System.out.println("Enter % of tax: ");
        taxRate = ScanNa.nextDouble();

        taxRatio = taxRate / 100.0;

        finalTotal = total + (total * taxRatio);

        System.out.println("Subtotal is: $", total);
        System.out.println("Tax is: $", taxRatio);
        System.out.println("Final total is: $", finalTotal);


    }

}