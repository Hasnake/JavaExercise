package Arthimetic;

import java.util.Scanner;

/**
 * Created by hasnake on 4/27/18.
 */
public class Product {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);//

        System.out.print("Input the first number: ");
        int a = input.nextInt();//parsing the input text to the desired data type.
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int d = (a*b);
        System.out.println("Expected output");
        System.out.println(a + "*" + b+ " = " +d);
    }
}

