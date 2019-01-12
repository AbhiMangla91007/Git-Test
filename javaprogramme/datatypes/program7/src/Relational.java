/*Author : Abhinav Mangla
Version : 1.0.0
Purpose : Write a program to display the results of different relational operators
          and logical operators in Java on two Integer values and two Boolean values. 
          Input values to be given within the program. 
*/
class Relational{
	public static void main(String[] args) {
		int num1 = 12;
    	short num2 = 10;
    	boolean chk1 ;
    	boolean chk2 ;
    	chk1 = num1>0?true:false;
    	chk2= num1<0?true:false;
    	boolean chk3 = (!chk1 == chk2);
    	boolean chk4 = (chk1 != chk2 && false);
    	boolean chk5 = (chk1 || chk2);
    	//Other Relational Operators >=, <=
    	System.out.println("chk1 : " + chk1);
		System.out.println("chk2 : " + chk2);
		System.out.println("chk3 : " + chk3);
		System.out.println("chk4 : " + chk4);
		System.out.println("chk5 : " + chk5);
	}
}