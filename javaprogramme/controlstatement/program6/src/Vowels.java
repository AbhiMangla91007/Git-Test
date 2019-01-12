/*Author : Abhinav Mangla
Version : 1.0.0
Purpose  : Write a Java program that asks the user to provide a single character from the alphabet.
           Print Vowel or Consonant, depending on the user input. If the user input is not a letter 
           (between a and z or A and Z), or is a string of length > 1, print an error message.
*/
import java.util.*;
class Vowels{
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = in.next();
        boolean uppercase , lowercase , vowels;
        uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") || input.equals("A") || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("U");
        if (input.length() > 1)
        {
            System.out.println("Input is not a single character.");
        }
        else if (!(uppercase || lowercase)) //if any one fails, then not a letter
        {
            System.out.println("Input is not a letter.");
        }
        else if (vowels)
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
	}
}