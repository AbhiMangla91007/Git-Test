/*Author : Abhinav Mangla
Version : 1.0.0
Purpose  : Write a Java program that reads in two floating-point numbers and tests
           whether they are the same up to three decimal places 
*/
import java.util.*;
class FloatNo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter first decimal number: ");
        double x = input.nextDouble();
        System.out.print("Enter second decimal number: ");
        double y = input.nextDouble();
        x = Math.round(x * 1000);
        x = x / 1000; 
        y = Math.round(y * 1000);
        y = y / 1000;
        if (x == y){
            System.out.println("Same up to three decimal places");
        }
        else{
            System.out.println("Different");
        }
	}
}