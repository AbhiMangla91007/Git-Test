import java.util.*;
class BoxWeightDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BoxWeight b1 = new BoxWeight();
		System.out.println("Enter the Width of box");
		b1.width = scan.nextFloat();
		System.out.println("Enter the Height of box");
		b1.height = scan.nextFloat();
		System.out.println("Enter the Depth of box");
		b1.height = scan.nextFloat();
		System.out.println(b1.getWeight());
		System.out.println(b1.getVolume());
	}
}