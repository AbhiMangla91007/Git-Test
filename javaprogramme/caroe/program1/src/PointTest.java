import java.util.*;
class PointTest{
	public static void main(String[] args) {
		float x1, x2, y1, y2, dist;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x1:");
		x1 = scan.nextFloat();
		System.out.println("Enter the value of y1:");
		y1 = scan.nextFloat();
		System.out.println("Enter the value of x2:");
		x2 = scan.nextFloat();
		System.out.println("Enter the value of x2:");
		x2 = scan.nextFloat();
		float pt1 = new Point(x1,y1);
		float pt2 = new Point(x2,y2);
		dist = pt1.calcDist(pt2);
		System.out.println("The distance between the two points is: "+String.format("%7.2f",dist));
	}
}