/*Author : Abhinav Mangla
Version : 1.0.0
Purpose : Write a program that prints the integer representation of a given character. The character is given within the program. 
*/
class CharRep{
	public static void main(String[] args) {
		char c1 = 'B';
		int a = c1;
		int castascii = (int)c1;
		System.out.print("Character is ");
		System.out.print("ASCII value is" + a);
	}
}