/*Author : Abhinav Mangla
Version : 1.0.0
Purpose  : Write an application that inputs one number consisting of five digits from 
           the user, separates the number into its individual digits in the same order
           and prints the digits separated from one another by three spaces each 
*/
import java.util.*;
class Space{
	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
        char ch;
        int no;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int digit5;   
        do {      
            System.out.print("Enter An Integeral Number Consisting of Five Digits : ");
            no = input.nextInt();
            digit5 = no % 10;
            digit4 = (no % 100)/10;
            digit3 = (no % 1000)/100;
            digit2 = (no % 10000)/1000;
            digit1 = no / 10000;
            if (no >= 10000 && no <= 99999)
            {
                System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);
            }
            else
            {
                System.out.println("Integral number contains more or less digits than 5");
                continue;
            }
            
            System.out.print("Press N to EXIT else any key to continue :");
            ch = input.next().charAt(0);
            if ((ch == 'N') || (ch == 'n'))
            {
                break;
            }
        } while (true);
	}
}