/*Author : Abhinav Mangla
Version : 1.0.0
Purpose  : Write a Java program to solve quadratic equations (use if, else if and else)  
*/
import java.util.*;
class QuadEq{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Input a: ");
	int a = input.nextInt();
	System.out.print("Input b: ");
	int b = input.nextInt();
	System.out.print("Input c: ");
	int c = input.nextInt();	
	double result = b * b - 4.0 * a * c;
	if(result > 0.0){
	double r1 = (-b + Math.pow(result, 0.5))/(2.0 * a);
	double r2 = (-b - Math.pow(result, 0.5))/(2.0 * a);	
	System.out.println("The Roots Are" + r1 + "And" + r2);
	} else if(result == 0.0){
	double r1 = -b/(2.0*a);
	System.out.println("The Root is" + r1);
	}else
	System.out.println("The Roots Are Not Possible");
	}
}