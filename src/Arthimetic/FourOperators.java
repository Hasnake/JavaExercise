package Arthimetic;

import java.util.Scanner;
/**
 * Created by hasnake on 4/27/18.
 */
public class FourOperators {
    public static void main(String [] args){
        Scanner input=new Scanner (System.in);
        System.out.print("Input the first number: ");
        int x = input.nextInt();//parsing the input text to the desired data type.
        System.out.print("Input the second number: ");
        int y = input.nextInt();
        int a = (x+y);
        int b = (x-y);
        int c = (x*y);
        int d = (x/y);
        //remainder % modules
        int e = (x % y);

        System.out.println();
        System.out.println("Expected result");
        System.out.println("The sum of "+x+" and "+y+" is:" +a);
        System.out.println("The difference of "+x+" and "+y+" is:" +b);
        System.out.println("The product of "+x+" and "+y+" is:" +c);
        System.out.println("The division of "+x+" and "+y+" is:" +d);
        System.out.println(x+" mod "+y+" is:" +e);
        for (int z=1;z<11;z++)
        System.out.println(x+" * "+z+" = "+z*x);
    }
}
