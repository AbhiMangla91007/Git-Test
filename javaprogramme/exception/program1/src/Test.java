import java.util.*;
class Test{
	public static void setTitle(String title) {
	if (title == null){
		throw new IllegalArgumentException("");
	}	
	System.out.println(title);
	}
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter your Choice - 1.ArithmeticException 2.ArrayIndexOutOfBoundsException 3.NumberFormatException 4.NullPointerException 5.IllegalArgumentException");
         int choice = sc.nextInt();
         switch(choice)
         {
	        case 1 :
	        try{
		    int num1 = 20 , num2 = 0;
		    int output = num1/num2;
		    System.out.println("Result " + output);
	        }
	        catch(ArithmeticException e){
	        	System.out.println("You should not divide a number by zero");
	        }
	        break;
	        case 2 :
	        try{
	        	int a[] = new int[10];
	        	a[11] = 1;
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	        	System.out.println("ArrayIndexOutOfBound");
	        }
	        break;
	        case 3 :
	        try{
	        	int num = Integer.parseInt("XYZ");
	        	System.out.println(num);
	        }
	        catch(NumberFormatException e){
	        	System.out.println("Number Format Exception occured");
	        }
	        break;
	        case 4:
	        try{
	        String str = null;
	        System.out.println(str.length());

	        }
	        catch(NullPointerException e)
	        {
	        	System.out.println(" NullPointerException..");

	        }
	        break;
	        case 5:
	        try{
	        	String x = null;
	        	setTitle(x);
	        	 }
	        	 catch(IllegalArgumentException e){
	        	 	System.out.println("IllegalArgumentException");
	        	 } 
	        	 break;
        }	
	}
}