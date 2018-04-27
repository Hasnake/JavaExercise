package Arthimetic;
import java.util.Scanner;

/**
 * Created by hasnake on 4/27/18.
 */
public class Division {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        double a = input.nextDouble();
        System.out.print("Input the second number: ");
        double b = input.nextDouble();
        double d = (a/b);
        System.out.println();
        System.out.println("The division of a and b is:" +d);
    }
}