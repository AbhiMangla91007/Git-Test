import java.util.*;
class CircleDemo{
	public static void main(String[] args) {
		Circle c1 = new Circle( );
	    c1.radius =2;
	    c1.displayArea();
	    Circle c2 = new Circle( );
	    c2.radius =5;
	    c2.displayArea();
        Circle c3 = new Circle( );
	    Scanner input = new Scanner(System.in);
	    System.out.print("Input the Radius: ");
        c3.radius = input.nextLong();
	    c3.displayArea();
	}
}