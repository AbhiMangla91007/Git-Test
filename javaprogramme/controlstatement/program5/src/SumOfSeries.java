/*Author : Abhinav Mangla
Version : 1.0.0
Purpose  : Compute the sum of the series:
      1+x+x2 /2!+x3/3!+……
*/
import java.util.*;
class SumOfSeries{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        int i , n , factorial = 1;
        double x , sum = 1;  
        System.out.println("EQUATION :: 1 + x + x^2/2! + x^3/3! + ... + x^n/n! ");
        System.out.print("Enter value of x :");
        x = input.nextDouble();
        System.out.print("Enter number of terms,n :");
        n = input.nextInt();
        for (i=1; i<=n; ++i){
        factorial = factorial * i;
		sum = sum + Math.pow(x,i) / factorial;
        }
        System.out.println("Sum of the EQUATION = " + sum);
	}
}