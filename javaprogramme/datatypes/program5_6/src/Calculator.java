/*Author : Abhinav Mangla
Version : 1.0.0
Purpose : Write a program that takes two integers (values to be given within the program) and displays 
          the output of the following operators: addition, subtraction, multiplication,
          division and modulus. 
*/
class Calculator{
	public static void main(String[] args) {
		int num1 = 12;
        short num2 = 10;
        int sum = num1 + num2;
        int diff = num1 - num2;
        long product = num1 * num2;
        float quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Number are : " + num1 + " and " + num2);
        System.out.println("Sum of these numbers " + sum);
        System.out.println("Difference of these numbers " + diff);
        System.out.println("Product of these numbers " + product);
        System.out.println("Quotient of these numbers " + quotient);
        System.out.println("Remainder of these numbers " + remainder);
	}
}