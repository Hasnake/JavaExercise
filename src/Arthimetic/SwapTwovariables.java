package Arthimetic;
import java.util.Scanner;
/**
 * Created by hasnake on 4/27/18.
 */
public class SwapTwovariables {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int a, b, temp;
        System.out.print("Enter value of a :");
        a = input.nextInt();

        System.out.print("Enter value of b :");
        b = input.nextInt();

        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}

