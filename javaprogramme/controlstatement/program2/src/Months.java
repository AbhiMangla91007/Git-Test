/*Author : Abhinav Mangla
Version : 1.0.0
Purpose  : Write a Java program that takes a number from the user between 1 and 12 
           and displays the name of the corresponding month until the user wants to exit the program  
*/
import java.util.*;
class Months{
	public static void main(String[] args) {
	int choice; //Number to check with 
        char ch;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter your number : ");
            choice = input.nextInt();
            if (choice == 1)
                System.out.println("January");
            else if (choice == 2)
                System.out.println("February");
            else if (choice == 3)
                System.out.println("March");
            else if (choice == 4)
                System.out.println("April");
            else if (choice == 5)
                System.out.println("May");
            else if (choice == 6)
                System.out.println("June");
            else if (choice == 7)
                System.out.println("July");
            else if (choice == 8)
                System.out.println("August");
            else if (choice == 9)
                System.out.println("September");
            else if (choice == 10)
                System.out.println("October");
            else if (choice == 11)
                System.out.println("November");
            else if (choice == 12)
                System.out.println("December");
            else
                System.out.println("Sorry I need a number from 1-12.");
            System.out.print("Press Y to continue else any key to exit :");
            ch = input.next().charAt(0);
            } while (ch == 'Y' || ch == 'y');  
	}
}