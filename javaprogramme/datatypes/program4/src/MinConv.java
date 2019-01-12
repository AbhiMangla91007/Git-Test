/*Author : Abhinav Mangla
Version : 1.0.0
Purpose : Write a Java program to convert minutes into the number of years, months and days. 
*/
import java.util.*;
class MinConv{
	public static void main(String[] args) {
		long min , year , month , days;
		Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        min = input.nextLong();
        year = min / (60 * 24 * 28 * 12);
		month = (min % (60 * 24 * 28 * 12)) / (60*24*28);
		days = ((min % (60 * 24 * 28 * 12)) % (60*24*28)) / (60*24);
        System.out.println(min + " minutes is approximately " + year + " years " + month + "months and" + days + " days ");
	}
}