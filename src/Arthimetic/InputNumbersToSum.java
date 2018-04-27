package Arthimetic; /**
 * Created by hasnake on 4/20/18.
 */
import java.util.Scanner;
public class InputNumbersToSum{


    public static void main(String[] args)
    {

        Scanner input = new Scanner (System.in);

        //First number
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        //second number
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        //third number
        System.out.print("Input the third number: ");
        int num3 = input.nextInt();

        //Sum
        int sum = num1 + num2+num3;
        //mean
        int mean=sum/3;
        System.out.println();
        System.out.println("Sum: "+sum);
        System.out.println("average: "+mean);

    }

}
