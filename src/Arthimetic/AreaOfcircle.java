package Arthimetic;
import java.util.Scanner;
/**
 * Created by hasnake on 4/27/18.
 */
public class AreaOfcircle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Input the radius:");
        int r =input.nextInt();
        System.out.println("Perimeter of the circle is = "+2*r* Math.PI);
        System.out.println("Area of the circle is ="+(r^r) * Math.PI);
    }

}
